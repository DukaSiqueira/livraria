import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Início da criação de livros
        ArrayList<String> autores1 = new ArrayList<String>();
        autores1.add("Eduardo");
        autores1.add("Samuel");

        ArrayList<String> generos = new ArrayList<String>();
        generos.add("T.I.");
        generos.add("Computação");

        Livro livro1 = new Livro();
        livro1.setId(1);
        livro1.setTitulo("P.O.O.");
        livro1.setGenero(generos);
        livro1.setEditora("Saber");
        livro1.setAutores(autores1);
        livro1.setDataLancamento("2000-01-01");
        livro1.setNmrPaginas(100);
        livro1.setQtdEstoque(100);
        livro1.setValorVenda(50);

        ArrayList<String> autores2 = new ArrayList<String>();
        autores2.add("Igor");
        autores2.add("Marcos");

        Livro livro2 = new Livro();
        livro2.setId(2);
        livro2.setTitulo("Estrutura de dados");
        livro2.setGenero(generos);
        livro2.setEditora("Library");
        livro2.setAutores(autores2);
        livro2.setDataLancamento("2001-02-02");
        livro2.setNmrPaginas(200);
        livro2.setQtdEstoque(200);
        livro2.setValorVenda(50);
        // Fim da criação de livros

        // Início da criação de um cliente
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setRua("AV. JJ");
        endereco.setNumero("S/N");
        endereco.setBairro("Concórdia");
        endereco.setCidade("Toledo");
        endereco.setEstado("PR");
        endereco.setPais("BR");

        Cliente cliente = new Cliente(1, "João", "4599920", endereco);
        cliente.setId(1);
        cliente.setNome("João");
        cliente.setTelefone("4599920");
        cliente.setEndereco(endereco);
        // Fim da criação de um cliente

        // Início da criação de uma venda
        // Início da criação dos itens de uma venda
        ItemVenda item1 = new ItemVenda();
        item1.setId(1);
        item1.setItem(livro1);
        item1.setQtdItem(2);
        item1.setValorUn(livro1.getValorVenda());
        item1.setValorUnDesconto(1);
        item1.setValorTotal(livro1);

        ItemVenda item2 = new ItemVenda();
        item2.setId(2);
        item2.setItem(livro2);
        item2.setQtdItem(2);
        item2.setValorUn(livro2.getValorVenda());
        item2.setValorUnDesconto(1);
        item2.setValorTotal(livro2);

        ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
        itens.add(item1);
        itens.add(item2);
        // Fim da criação dos itens de uma venda

        // Início da criação de formas de pagamento
        FormaPagamento f1 = new FormaPagamento();
        f1.setId(1);
        f1.setTipoPagamento("PIX");
        f1.setValorPago(98);

        FormaPagamento f2 = new FormaPagamento();
        f2.setId(2);
        f2.setTipoPagamento("Dinheiro");
        f2.setValorPago(100);

        ArrayList<FormaPagamento> formasPagemento = new ArrayList<FormaPagamento>();
        formasPagemento.add(f1);
        formasPagemento.add(f2);
        // Fim da criação de formas de pagamento

        Venda venda = new Venda();
        venda.setId(1);
        venda.setTotalVenda(itens);
        venda.setItensVenda(itens);
        venda.setCliente(cliente);
        venda.setFormasPagamento(formasPagemento);
        venda.atualizaEstoqueVenda(itens);
        // Fim da criação de uma venda

        // Imprime a venda
        System.out.println(venda.toString());

    }
}

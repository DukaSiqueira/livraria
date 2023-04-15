import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco(1, "Ângelo donin", "97",
                "concórdia", "TOLEDO", "PR", "Brasil");

        Pessoa autor = new Pessoa(1, "Eduardo", "45998595266",
                endereco);

        Livro livro1 = new Livro(1, "P.O.O.", "T.I.", "SABER",
                autor, "15-08-1980", 195, 25, 25);

        Livro livro2 = new Livro(2, "Banco de dados", "T.I.", "Library Tech",
                autor, "15-08-1923", 275, 30, 50);

        Livro livro3 = new Livro(3, "Metódologia SCRUM", "T.I.", "Aurora livros",
                autor, "15-08-2011", 146, 50, 100);

        FormaPagamento formaPagamento1 = new FormaPagamento(1,"PIX", 15, 0);
        FormaPagamento formaPagamento2 = new FormaPagamento(2,"Débito", 15, 0);

        ArrayList<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();
        formasPagamento.add(formaPagamento1);
        formasPagamento.add(formaPagamento2);

        ItemVenda itemVenda1 = new ItemVenda(1, livro1, 1, 25, 5, 20);
        ItemVenda itemVenda2 = new ItemVenda(2, livro2, 1, 25, 5, 20);
        ItemVenda itemVenda3 = new ItemVenda(3, livro3, 1, 25, 5, 20);

        ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
        itens.add(itemVenda1);
        itens.add(itemVenda2);
        itens.add(itemVenda3);

        Venda venda = new Venda(1, 20, itens, formasPagamento, autor);

        System.out.println(venda.toString());

    }
}

package model;


import java.util.ArrayList;

public class Venda {

    private int id;
    private double totalVenda;
    private ArrayList<ItemVenda> itensVenda;
    private ArrayList<FormaPagamento> formasPagamento;
    private Cliente cliente;

    private double troco;

    public Venda() {}

    public Venda(int id, double totalVenda, ArrayList<ItemVenda> itensVenda, ArrayList<FormaPagamento> formasPagamento, Cliente cliente, double troco) {
        this.id = id;
        this.totalVenda = totalVenda;
        this.itensVenda = itensVenda;
        this.formasPagamento = formasPagamento;
        this.cliente = cliente;
        this.troco = troco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(ArrayList<ItemVenda> itensVenda) {
        for (ItemVenda itemVenda: itensVenda) {
            this.totalVenda += itemVenda.getValorTotal();
        }
    }

    public void atualizaEstoqueVenda(ArrayList<ItemVenda> itensVenda) {
        for (ItemVenda itemVenda: itensVenda) {
            itemVenda.getItem().removeEstoque(itemVenda.getQtdItem());
        }
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public ArrayList<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(ArrayList<FormaPagamento> formasPagamento) {
        double totalPagar = this.getTotalVenda();
        double totalPago = 0;
        int indiceFinal = formasPagamento.size() -1;
        int indiceAtual = 0;

        for (FormaPagamento formaPagamento: formasPagamento) {
            totalPago += formaPagamento.getValorPago();

            if (totalPago < totalPagar && indiceAtual >= indiceFinal) {
                throw new RuntimeException("Não há formas de pagamento suficientes para pagar o valor total da venda.");
            }
            indiceAtual++;
        }

        if (totalPago > totalPagar) {
            this.calculaTroco(totalPago, totalPagar);
        }

        this.formasPagamento = formasPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public void calculaTroco(double totalPago, double totalPagar) {
        double troco = totalPago - totalPagar;
        this.setTroco(troco);
    }

    @Override
    public String toString() {
        return "Venda - " +
                " Total Venda: " + totalVenda + "\n" +
                "Troco: " + troco + "\n" +
                "Itens Venda: " + "\n" + itensVenda + "\n" +
                "Formas Pagamento: " + formasPagamento + "\n" +
                "Cliente: " + cliente;
    }
}

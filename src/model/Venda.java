package model;


import java.util.ArrayList;

public class Venda {

    private int id;
    private double totalVenda;
    private ArrayList<ItemVenda> itensVenda;
    private ArrayList<FormaPagamento> formasPagamento;
    private Pessoa cliente;

    public Venda() {}

    public Venda(int id, double totalVenda, ArrayList<ItemVenda> itensVenda, ArrayList<FormaPagamento> formasPagamento, Pessoa cliente) {
        this.id = id;
        this.totalVenda = totalVenda;
        this.itensVenda = itensVenda;
        this.formasPagamento = formasPagamento;
        this.cliente = cliente;
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

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
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
        this.formasPagamento = formasPagamento;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda:" +
                "id - " + id + "\n" +
                "totalVenda - " + totalVenda + "\n" +
                "itensVenda - " + itensVenda + "\n" +
                "formasPagamento - " + formasPagamento + "\n" +
                "cliente - " + cliente + "\n";
    }
}

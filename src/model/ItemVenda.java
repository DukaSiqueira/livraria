package model;

public class ItemVenda {

    private int id;
    private Livro item;
    private int qtdItem;
    private double valorUn;
    private double valorUnDesconto;
    private double valorTotal;

    public ItemVenda() {}

    public ItemVenda(int id, Livro item, int qtdItem, double valorUn, double valorUnDesconto, double valorTotal) {
        this.id = id;
        this.item = item;
        this.qtdItem = qtdItem;
        this.valorUn = valorUn;
        this.valorUnDesconto = valorUnDesconto;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getItem() {
        return item;
    }

    public void setItem(Livro item) {
        this.item = item;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getValorUn() {
        return valorUn;
    }

    public void setValorUn(double valorUn) {
        this.valorUn = valorUn;
    }

    public double getValorUnDesconto() {
        return valorUnDesconto;
    }

    public void setValorUnDesconto(double valorUnDesconto) {
        this.valorUnDesconto = valorUnDesconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id - " + id + "\n" +
                "item - " + item + "\n" +
                "quantidade Item - " + qtdItem + "\n" +
                "valor Unitário - " + valorUn + "\n" +
                "valor Unitário Desconto - " + valorUnDesconto + "\n" +
                "valor Total - " + valorTotal + "\n";
    }
}
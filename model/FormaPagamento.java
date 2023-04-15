package model;

public class FormaPagto {

    private int id;
    private String tipoPagamento;
    private double valorPago;
    private double troco;

    public FormaPagto() {}

    public FormaPagto(int id, String tipoPagamento, double valorPago, double troco) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorPago = valorPago;
        this.troco = troco;
    }

    public int getId() {
        return id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public double getTroco() {
        return troco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    @Override
    public String toString() {
        return "Forma de pagamento {" + "Id: " + id + "\n" +
                + "Tipo de pagamento: " + tipoPagamento + "\n" +
                + "Valor pago: " + valorPago + "\n" +
                + "Troco: " + troco;
    }

}

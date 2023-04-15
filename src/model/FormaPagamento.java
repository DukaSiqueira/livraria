package model;

public class FormaPagamento {

    private int id;
    private String tipoPagamento;
    private double valorPago;

    public FormaPagamento() {}

    public FormaPagamento(int id, String tipoPagamento, double valorPago) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorPago = valorPago;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Tipo de pagamento: " + tipoPagamento + "\n" +
                "Valor pago: " + valorPago + "\n";
    }
}

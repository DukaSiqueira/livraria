package model;

public class Endereco {

    private String nmRua;
    private String nmBairro;
    private int nmrCasa;
    private String nmCidade;
    private String nmEstado;
    private String pais;

    public Endereco() {
    }

    public Endereco(String nmRua, String nmBairro, int nmrCasa,
                    String nmCidade, String nmEstado, String pais) {
        this.nmRua = nmRua;
        this.nmBairro = nmBairro;
        this.nmrCasa = nmrCasa;
        this.nmCidade = nmCidade;
        this.nmEstado = nmEstado;
        this.pais = pais;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmrua(String nmRua) {
        this.nmRua = nmRua;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public int getNmrCasa() {
        return nmrCasa;
    }

    public void setNmrCasa(int nmrCasa) {
        this.nmrCasa = nmrCasa;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "Nome da rua= " + nmRua + ", Nome do Bairro= " + nmBairro + ", Numero da Casa= " + nmrCasa +
                ", Nome da Cidade= " + nmCidade + ", Nome do Estado= " + nmEstado + ", pais= " + pais + '}';
    }


}

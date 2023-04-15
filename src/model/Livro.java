package model;

import java.util.Date;
import java.util.List;

public class Livro {

    private int id;
    private String titulo;
    private String genero;
    private String editora;
    private String autor;
    private String dataLancamento;
    private int nmrPaginas;
    private int qtdEstoque;
    private double valorVenda;

    public Livro() {}

    public Livro(int id, String titulo, String genero, String editora, String autor, String dataLancamento, int nmrPaginas, int qtdEstoque, double valorVenda) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.editora = editora;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.nmrPaginas = nmrPaginas;
        this.qtdEstoque = qtdEstoque;
        this.valorVenda = valorVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNmrPaginas() {
        return nmrPaginas;
    }

    public void setNmrPaginas(int nmrPaginas) {
        this.nmrPaginas = nmrPaginas;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void vendaLivro(int qtdVenda) {
        if (qtdVenda >  this.qtdEstoque) {
            throw new IllegalArgumentException("Quantidade insuficiente para venda.");
        }

        this.qtdEstoque -= qtdVenda;
    }

    public double calculaValorVenda(int qtdVenda, double descontoUn) {
        double valorUn = this.valorVenda - descontoUn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", nmrPaginas=" + nmrPaginas +
                ", qtdEstoque=" + qtdEstoque +
                ", valorVenda=" + valorVenda +
                '}';
    }
}

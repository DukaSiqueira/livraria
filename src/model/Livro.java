package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Livro {

    private int id;
    private String titulo;
    private ArrayList<String> genero;
    private String editora;
    private ArrayList<String> autores;
    private String dataLancamento;
    private int nmrPaginas;
    private int qtdEstoque;
    private double valorVenda;

    public Livro() {
    }

    public Livro(int id, String titulo, ArrayList<String> genero, String editora, ArrayList<String> autores, String dataLancamento, int nmrPaginas, int qtdEstoque, double valorVenda) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.editora = editora;
        this.autores = autores;
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

    public ArrayList<String> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<String> genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
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

    public void adicionaEstoque(int qtdAdicionar) {
        this.qtdEstoque += qtdAdicionar;
    }

    public void removeEstoque(int qtdRemover) {
        if (qtdRemover > qtdEstoque) {
            throw new RuntimeException("Nãp há produtos suficientes para realizar essa venda.");
        }
        this.qtdEstoque -= qtdRemover;
    }

    @Override
    public String toString() {
        return "Livro - " +
                "Título: " + titulo +
                " Gênero: " + genero +
                " Editora: " + editora +
                " Autores: " + autores +
                " Data Lancamento: " + dataLancamento +
                " Total Páginas: " + nmrPaginas +
                " Em estoque: " + qtdEstoque +
                " Valor Venda: " + valorVenda + "\n";
    }
}

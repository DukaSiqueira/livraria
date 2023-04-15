package model;

public class Livro {

    private int id;
    private String titulo;
    private String genero;
    private String editora;
//    private Pessoa autor;
    private Date dataLancamento;
    private int nmrPaginas;
    private int qtdEstoque;
    private double valorVenda;

    public Livro() {}

    public Livro (int id, String titulo, String genero, String editora, /*Pessoa autor, */Date dataLancamento, int nmrPaginas,
        int qtdEstoque, double valorVenda) {
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

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
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

    @Override
    public toString() {
        return "Livro: \n" +
                "id - " + id + "\n" +
                "titulo - " + titulo + "\n" +
                "genero - " + genero + "\n" +
                "editora - " + editora + "\n" +
                "data Lançamento - " + dataLancamento + "\n" +
                "número Páginas - " + nmrPaginas + "\n" +
                "quantidade Estoque - " + qtdEstoque + "\n" +
                "valor Venda - " + valorVenda + "\n" +;
    }
}

package model;

public class Pessoa {

    private int id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {}

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa:" + "\n" +
                "id - " + id + "\n" +
                "Nome - " + nome + "\n" +
                "Telefone - " + telefone + "\n" +
                "Endereco - " + endereco;

    }

}

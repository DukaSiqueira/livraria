package model;

public class Estoque {
    
    //ATRIBUTOS
    private int qtdLivro;
    private Livro Livro;
    
    //CONSTRUTORES
    public Estoque(){
        
    }
    
    public Estoque(int qtdLivro, Livro Livro){
        this.qtdLivro = qtdLivro;
        this.Livro = Livro;
    }
    
    //GET E SETTERS
    public int getQtdLivro(){
        return qtdLivro;
    }
    
    public void setQtdLivro(int qtdLivro){
        this.qtdLivro = qtdLivro;
    }
    
    public Livro getLivro(){
        return Livro;
    }
    
    public void setLivro(Livro Livro){
        this.Livro = Livro;
    }

    @Override
    public String toString() {
        return "Estoque{" + "qtdLivro=" + qtdLivro + ", Livro=" + Livro + '}';
    } 
    
}

package br.edu.infnet.model;

public class Livro {
    
    private String isbn;
    private String titulo;
    private String descricao;
    private String autor;
    private int estoque;
    private double preco;
    private String figura;
    
    public Livro(){        
    }

    public Livro(String isbn, String titulo, String descricao, String autor, int estoque, double preco, String figura) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.estoque = estoque;
        this.preco = preco;
        this.figura = figura;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    
    
}

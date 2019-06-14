package br.edu.infnet.model;

import java.util.ArrayList;

public class ListaDeLivros {
    
    public ArrayList<Livro> buscarLivros(){
        
        ArrayList<Livro> livros = new ArrayList<>();
        
        Livro l1 = new Livro("001", "Livro A", "", "Autor A", 10, 99.90, "livA.jpg");
        Livro l2 = new Livro("002", "Livro B", "", "Autor B", 10, 99.90, "livB.jpg");
        Livro l3 = new Livro("003", "Livro C", "", "Autor C", 10, 99.90, "livC.jpg");
        

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        return livros;
    }
    
    public Livro obterLivro(String isbn){
        ArrayList<Livro> livros = buscarLivros();
        for (Livro livro : livros){
            if(livro.getIsbn().equals(isbn))
                return livro;
        }
        return null;
    }
}

package com.javadio.Collections.set.list;
import java.util.ArrayList;
import java.util.List;

public class CatLivro {
/*Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como 
    atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes
    métodos:
    adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
    pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros 
    encontrados.
    pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um 
    determinado intervalo de anos e retorna uma lista com os livros encontrados.
   c: Pesquisa livros por título e retorna o primeiro livro encontrado.

private List<Livro> livroList;
public catalogoLivro(){this.catLivros = new ArrayList<>();}

public adicionarLivro(String titulo, String autor, int anoPublicacao){
    catLivro.add(new Livro(titulo, autor, anoPublicacao));
}

public PesquisarPorAutor(String autor){
    list<Livro> livroPorAutor = new ArrayList<>();
     if (!CatLivro.isEmpty()) {
            for (Item l : CatLivro) {
              if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l); 
              }
            }
            return livrosPorAutor;
          }
        }

public pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    list<Livro> livroPorIntervaloAno = new ArrayList<>();
    if (!CatLivro.isEmpty()) {
        for(livro l :livroList){
            if(getAnoPublicacao()>= anoInicial && l.getAnoPublicacaoO()<=anoFinal){
                livroPorIntervaloAno.add(l);
            }
        }
    }   
        return livroPorIntervaloAno

}
public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(livroList.isEmpty()){
        for(livro l : livroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
    }
    return livroPorTitulo;
}

public static void main(String[] args){
    CatLivros ctLivros = new CatLivros();
    ctLivros.adicionarLivro("Livro 1 ","Autor 1",2020);
    ctLivros.adicionarLivro("Livro 2 ","Autor 2",2020);
    ctLivros.adicionarLivro("Livro 3 ","Autor 3",2020);
    ctLivros.adicionarLivro("Livro 4 ","Autor 4",2020);
    ctLivros.adicionarLivro("Livro 5 ","Autor 5",2020);
}
*/
}
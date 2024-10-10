package com.javadio.list;

public class Livro {
    /*Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como 
    atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes
    métodos:
    adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
    pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros 
    encontrados.
    pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um 
    determinado intervalo de anos e retorna uma lista com os livros encontrados.
    pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
    */
private String titulo;
private String autor;
private int  anoPublic;
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public int getAnoPublic() {
    return anoPublic;
}
public void setAnoPublic(int anoPublic) {
    this.anoPublic = anoPublic;
}
public Livro(String titulo, String autor, int anoPublic) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublic = anoPublic;
}
@Override
public String toString() {
    return "Livro [titulo= " + titulo + ", autor= " + autor + ", anoPublic= " + anoPublic + "]";
}



}

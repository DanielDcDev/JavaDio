package com.javadio.Collections.Map.OpBasicas;

public class Palavras {

     //atributos
    private String palavra;
    private String definicao;

     //construtor
    public Palavras(String palavra, String definicao) {
        this.palavra = palavra;
        this.definicao = definicao;
    }
     //metodos
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    public String getDefinicao() {
        return definicao;
    }
    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
     //to String
    @Override
    public String toString() {
        return "Dicionario [palavra=" + palavra + ", definicao=" + definicao + "]";
    }

     
    
}

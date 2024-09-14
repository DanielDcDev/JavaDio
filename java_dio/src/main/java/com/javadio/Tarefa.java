package com.javadio;

public class Tarefa {
//atributo
    private String descricao;
//construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
//Getter
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return  descricao ;
    }

    
}
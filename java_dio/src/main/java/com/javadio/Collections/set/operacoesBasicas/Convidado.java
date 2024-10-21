package com.javadio.Collections.set.operacoesBasicas;

public class Convidado {
    private String nome;
    private int CodConvite;
    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        CodConvite = codConvite;
    }
    public String getNome() {
        return nome;
    }
    public int getCodConvite() {
        return CodConvite;
    }
    @Override
    public String toString() {
        return "Convidado [nome= " + nome + ", CodConvite= " + CodConvite + "]";
    }
    
    
}

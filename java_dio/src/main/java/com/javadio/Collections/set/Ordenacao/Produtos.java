package com.javadio.Collections.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
    // Atributos 
    //long cod, String nome, double preco, int quantidade
    
    private Long cod;
    @Override
    public int compareTo(Produtos p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }
    private String nome;
    private double preco;
    private int qtd;
    public Produtos(long cod, String nome, double preco, int qtd) {
        //TODO Auto-generated constructor stub
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod == null) ? 0 : cod.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produtos other = (Produtos) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        return true;
    }
    public Long getCod() {
        return cod;
    }
    public void setCod(Long cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    @Override
    public String toString() {
        return "Produtos [cod= " + cod + ", nome= " + nome + ", preco= " + preco + ", qtd= " + qtd + "]";
    }
    
    class ComparatorPorPreco implements Comparator<Produtos> {
        @Override
        public int compare(Produtos p1, Produtos p2) {
          return Double.compare(p1.getPreco(), p2.getPreco());
        }
}
}

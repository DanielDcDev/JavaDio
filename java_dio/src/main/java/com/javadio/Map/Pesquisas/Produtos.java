package com.javadio.Map.Pesquisas;

public class Produtos {
    private Long cod;
    private String nome;
    private int qtd;
    private Double preco;
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
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
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
    @Override
    public String toString() {
        return 
        "Produtos [cod= "
        + cod + ", nome= " 
        + nome + ", qtd= "
        + qtd + ", preco= "
        + preco + "]";
    }
    
}

package com.javadio.Collections.list.ordenacao;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private Double altura;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "pessoa ,  nome = " + nome + ", idade =" + idade + ", altura = " + altura + "]";
    }
    @Override
    public int compareTo(Pessoa arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
      return Double.compare(p1.getAltura(), p2.getAltura());
    }
  }


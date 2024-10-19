package com.javadio.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.javadio.set.Ordenacao.Produtos.ComparatorPorPreco;


public class CadProdutos {

    private Set<Produtos> cadProdutos;
    public CadProdutos(){
        this.cadProdutos = new HashSet<>();
    }
    public void AdicionarProduto(long cod, String nome, double preco, int qtd){
        cadProdutos.add(new Produtos(cod, nome, preco,qtd));
    }
    public Set<Produtos> ExibirPNome(){
        Set<Produtos> produtosPorNome =  new TreeSet<>(cadProdutos);
        return produtosPorNome;
    }
/*     public Set<Produtos>  ExibirPPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        cadProdutos.addAll(produtosPorPreco);
        return produtosPorPreco;
    }
        */
    
    public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadProdutos cadastroProdutos = new CadProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.AdicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos.AdicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos.AdicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos.AdicionarProduto(4L, "Teclado", 50d, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.cadProdutos);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.ExibirPNome());

    // Exibindo produtos ordenados por preço
    //System.out.println(cadastroProdutos.ExibirPPreco());
  }
}

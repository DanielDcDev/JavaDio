package com.javadio.Collections.Map.Pesquisas;

import java.util.HashMap;
import java.util.Map;


public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap; 
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int qtd, Double preco){
        estoqueProdutosMap.put(cod ,new Produtos(cod, nome, qtd, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double valorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produtos p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQtd() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
        for(Produtos p :estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        
    }
    return produtoMaisCaro;
    }
    public Produtos obterProdutoMaisBarato(){
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
        for(Produtos p :estoqueProdutosMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
            }
        }
    }
    return produtoMaisBarato;
    }
    public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produtos produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
          for (Map.Entry<Long, Produtos> entry : estoqueProdutosMap.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQtd();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

    // Exibe o estoque vazio
    estoque.exibirProdutos();

    // Adiciona produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

    // Exibe os produtos no estoque
    estoque.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoque.valorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produtos produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produtos produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produtos produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
    }

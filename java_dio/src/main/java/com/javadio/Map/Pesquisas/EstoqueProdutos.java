package com.javadio.Map.Pesquisas;

import java.util.HashMap;
import java.util.Map;


public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueProdutosMap; 
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void AdicionarProduto(long cod, String nome, int qtd, Double preco){
        estoqueProdutosMap.put(cod, new Produtos(nome, qtd, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public static void main(String[] args) {
        
    }







}

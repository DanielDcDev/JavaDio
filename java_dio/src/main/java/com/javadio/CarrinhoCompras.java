package com.javadio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
//atributo
    private List<Item> carrinhoList;
//contrutor
    public CarrinhoCompras(List<Item> carrinhoList) {
        this.carrinhoList = carrinhoList;
    }
public CarrinhoCompras() {
        //TODO Auto-generated constructor stub
    }
    //metodo adicionar
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }
//metodo remover
    public void temoverItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i: carrinhoList){
            if (i.getNome().equals(nome)) {
                itemRemover.add(i);
            }
        }
            itemRemover.removeAll(itemRemover);
    }
//Obtendo valor total do carrinho
    public void ValorCarrinho(Double preco, int qtd){
        Double valorTTL = 0.0;
        int qtdTT = 0;
        for(Item v:carrinhoList){
            valorTTL += preco;
            qtdTT += qtd;
        }
        System.out.println("Valor Total: " +valorTTL+ "Quantidade todal: "+qtdTT);
    }
//mostrar todos os itens no carrinho
    public void exibirItens(){
        System.out.println(carrinhoList);
    }
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.exibirItens();
        carrinhoCompras.adicionarItem("Daniel", 10.0, 0);
    }
}

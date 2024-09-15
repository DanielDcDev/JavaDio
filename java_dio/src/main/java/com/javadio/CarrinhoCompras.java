package com.javadio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
//atributo
    private List<Item> carrinhoList;
//contrutor
    public CarrinhoCompras() {
        this.carrinhoList = new ArrayList<>();
    }
    //metodo adicionar
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }
//metodo remover
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        if (!carrinhoList.isEmpty()) {
            for (Item i : carrinhoList) {
              if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
              }
            }
            carrinhoList.removeAll(itemRemover);
          } else {
            System.out.println("A lista está vazia!");
          }
        }

    
//Obtendo valor total do carrinho
public double ValorCarrinho() {
    double valorTotal = 0d;
    if (!carrinhoList.isEmpty()) {
      for (Item item : carrinhoList) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
//mostrar todos os itens no carrinho
    public void exibirItens(){
        System.out.println(carrinhoList);
    }
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        
        carrinhoCompras.adicionarItem("Daniel", 10.0, 0);
        carrinhoCompras.adicionarItem("Daniela", 10.0, 1);
        carrinhoCompras.adicionarItem("Daniel", 10.0, 2);
        carrinhoCompras.exibirItens();
        System.out.println(carrinhoCompras.ValorCarrinho());
        carrinhoCompras.removerItem("Daniel");
        carrinhoCompras.exibirItens();
    }
}

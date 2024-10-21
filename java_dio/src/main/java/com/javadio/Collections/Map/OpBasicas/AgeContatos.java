package com.javadio.Collections.Map.OpBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgeContatos {
    private Map<String, Integer> ageContatosMap;

    public AgeContatos() {
        this.ageContatosMap = new HashMap<>();
    }
    public void AdicionarContato(String nome, Integer telefone){
        ageContatosMap.put(nome, telefone);
    }
    public void RemoverContato(String nome){
        if(!ageContatosMap.isEmpty()){
            ageContatosMap.remove(nome);
        }else{
            System.out.println("Nao existe nenhum elemento no Map");
        }
    }
    public void ExibirContato(){
        System.out.println(ageContatosMap);
    }
    public Integer PesquisarPorNome(String nome){
        Integer numeroPorNome = 00000000;
        if(!ageContatosMap.isEmpty()){
            ageContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    
  public static void main(String[] args) {
    AgeContatos agendaContatos = new AgeContatos();

    // Adicionar contatos
    agendaContatos.AdicionarContato("Camila", 123456);
    agendaContatos.AdicionarContato("João", 5665);
    agendaContatos.AdicionarContato("Carlos", 1111111);
    agendaContatos.AdicionarContato("Ana", 654987);
    agendaContatos.AdicionarContato("Maria", 1111111);
    agendaContatos.AdicionarContato("Camila", 44444);

    agendaContatos.ExibirContato();

    // Remover um contato
    agendaContatos.RemoverContato("Maria");
    agendaContatos.ExibirContato();

    // Pesquisar número por nome
    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaContatos.PesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContatos.PesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }

}

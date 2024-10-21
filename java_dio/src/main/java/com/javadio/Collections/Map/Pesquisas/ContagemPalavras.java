package com.javadio.Collections.Map.Pesquisas;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasContagem;

    public ContagemPalavras(){
        this.palavrasContagem = new HashMap<>();
    }
    public void adicionarPalavras(String palavra, Integer contagem){
        palavrasContagem.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(!palavrasContagem.isEmpty()){
            palavrasContagem.remove(palavra);
        }else{
            System.out.println("a lista esta vazia!");
        }
    }
    public void exibirContagemPalavras(){
        System.out.println(palavrasContagem);

    }
    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasContagem.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
      }

    public static void main(String[] args) {

            ContagemPalavras contagemLinguagens = new ContagemPalavras();
        
            // Adiciona linguagens e suas contagens
            contagemLinguagens.adicionarPalavras("Java", 2);
            contagemLinguagens.adicionarPalavras("Python", 8);
            contagemLinguagens.adicionarPalavras("JavaScript", 1);
            contagemLinguagens.adicionarPalavras("C#", 6);
        
            // Exibe a contagem total de linguagens
            contagemLinguagens.exibirContagemPalavras();
        
            // Encontra e exibe a linguagem mais frequente
            String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
            System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
          }
    }



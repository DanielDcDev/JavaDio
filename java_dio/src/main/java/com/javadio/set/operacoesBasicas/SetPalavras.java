package com.javadio.set.operacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class SetPalavras {
    private Set<String> palavralist;

    public SetPalavras() {
        this.palavralist = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavralist.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavralist.isEmpty()){
            if(palavralist.contains(palavra)){
                palavralist.remove(palavra);
            }else{System.out.println("Palavra nao encontrada!");}
        }else{System.out.println("O conjunto esta vazio!");}
        }
    public boolean VerificarPalavra(String palavra){
        return palavralist.contains(palavra);
    }
    public void exibirPalavras() {
        if(!palavralist.isEmpty()) {
          System.out.println(palavralist);
        } else {
          System.out.println("O conjunto está vazio!");
        }
      }
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavras
        SetPalavras conjuntoLinguagens = new SetPalavras();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
    
        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavras();
    
        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavras();
    
        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.VerificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.VerificarPalavra("Python"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavras();
      }
    }



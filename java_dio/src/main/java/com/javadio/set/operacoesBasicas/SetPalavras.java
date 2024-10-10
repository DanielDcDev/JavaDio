package com.javadio.set.operacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class SetPalavras {
    private Set<Palavras> palavralist;

    public SetPalavras() {
        this.palavralist = palavralist;
    }

    public void adicionarPalavra(String pl){
        palavralist.add(new Palavras(pl));
    }
    public void removerPalavra(String palavra){
        palavralist.remove(palavra);
    }
    
}

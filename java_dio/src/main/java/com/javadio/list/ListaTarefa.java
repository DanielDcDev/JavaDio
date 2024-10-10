package com.javadio.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
//atributo
    private List<Tarefa> tarefaList;
//construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
//metodo adicionar
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
//metodo remover
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }
//metodo obter numero total de tarefas
    public int obterTotal(){
        return tarefaList.size();
    }
//metodo obter descricao total de tarefas
    public void obterDescricao(){
        System.out.println(tarefaList);
    }

public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println(" O numero total de elementos na lista e "+ listaTarefa.obterTotal());

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    listaTarefa.adicionarTarefa("Tarefa 3");
    System.out.println(" O numero total de elementos na lista e "+ listaTarefa.obterTotal());

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println(" O numero total de elementos na lista e "+ listaTarefa.obterTotal());

    listaTarefa.obterDescricao();

}
    
}

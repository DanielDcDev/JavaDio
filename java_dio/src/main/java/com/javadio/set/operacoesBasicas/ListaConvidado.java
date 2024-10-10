package com.javadio.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidado {
    // Atributo
    private Set<Convidado> convidadoSet;

    // Construtor
    public ListaConvidado() {
        this.convidadoSet = new HashSet<>();  // Inicializa o Set
    }

    // Métodos de adicionar e remover
    public void AdcConvidao(String nome, int codConvite) {
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void RemConvidadoCodconvite(int codConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodConvite() == codConvite) {
                convidadoRemover = c;
                break;
            } else {
                System.out.println("Não existe convidado na lista com esse convite.");
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contConvidados() {
        return convidadoSet.size();
    }

    public void ShowConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ListaConvidado listaConvidado = new ListaConvidado();

        listaConvidado.AdcConvidao("Convidado 1", 1234);
        System.out.println("Existem " + listaConvidado.contConvidados() + " convidado(s) dentro deste Set.");

        listaConvidado.AdcConvidao("Convidado 2", 2345);
        listaConvidado.AdcConvidao("Convidado 3", 3456);
        listaConvidado.AdcConvidao("Convidado 4", 4567);

        System.out.println("Existem " + listaConvidado.contConvidados() + " convidado(s) dentro deste Set.");

         listaConvidado.RemConvidadoCodconvite(2345);

        System.out.println("Existem " + listaConvidado.contConvidados() + " convidado(s) dentro deste Set.");
    }
}

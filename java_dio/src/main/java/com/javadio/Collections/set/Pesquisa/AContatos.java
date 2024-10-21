

package com.javadio.Collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AContatos {
    //atributos
    private Set<Contato> contatoSet;
    
    public AContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void AdicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void ExibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> PesquisarNome(String nome){
        Set<Contato> contatoPorNome =  new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AContatos agendaContatos = new AContatos();
    
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.ExibirContato();
    
        // Adicionando contatos à agenda
        agendaContatos.AdicionarContato("João", 123456789);
        agendaContatos.AdicionarContato("Maria", 987654321);
        agendaContatos.AdicionarContato("Maria Fernandes", 55555555);
        agendaContatos.AdicionarContato("Ana", 88889999);
        agendaContatos.AdicionarContato("Fernando", 77778888);
        agendaContatos.AdicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        agendaContatos.ExibirContato();
    
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.PesquisarNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.ExibirContato();
      }
}
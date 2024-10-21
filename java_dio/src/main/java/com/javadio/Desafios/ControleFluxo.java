package com.javadio.Desafios;
import java.util.Scanner;
public class ControleFluxo {

 public class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
}
    

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        // Solicitando o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        
        // Solicitando o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        // Tentativa de executar a contagem, capturando exceções
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro quando os parâmetros são inválidos
            System.out.println(exception.getMessage());
        }

        // Fechar o scanner
        terminal.close();
    }

    // Método para validar e realizar a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo e lançar a exceção
        if (parametroUm >= parametroDois) {
            System.out.print("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Realizar o for para imprimir os números incrementados
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

}

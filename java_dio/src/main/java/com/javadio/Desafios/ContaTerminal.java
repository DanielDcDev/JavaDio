package com.javadio.Desafios;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho das contas: ");
        int tamanho = scanner.nextInt();

        for(int i =0; i < tamanho ; i++){
        // Solicitando os dados ao usuário


        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        // Limpando o buffer do scanner após a leitura de um número inteiro
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
        }
    }
}


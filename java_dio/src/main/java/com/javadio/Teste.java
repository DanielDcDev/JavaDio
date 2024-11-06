package com.javadio;

import java.util.Scanner;

public class Teste {
    // Função para calcular a velocidade média de conexão de internet
    public static int calcularVelocidadeMedia(String[] velocidades) {
        double soma = 0;

        // Somando todas as velocidades registradas
        for (String velocidade : velocidades) {
            soma += Double.parseDouble(velocidade.trim()); // Convertendo string para double
        }

        // Calculando a média e arredondando para o inteiro mais próximo
        return (int) Math.round(soma / velocidades.length);
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada de velocidades em Mbps, separadas por vírgula
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão arredondada
        int velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão no formato desejado
        System.out.println(velocidadeMedia + " Mbps");

        scanner.close();
    }
}

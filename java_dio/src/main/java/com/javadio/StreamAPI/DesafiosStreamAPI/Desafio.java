package com.javadio.StreamAPI.DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {

    public static void Desafio01(List<Integer> n){
        List<Integer> numerosOrdenados = n.stream()
                                                .sorted()
                                                .collect(Collectors.toList());
        System.out.println("A lista sortida fica :" + numerosOrdenados);
    }
    public static void main(String[] args) {
        //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.4
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Desafio01(numeros);
                                                
    }
}

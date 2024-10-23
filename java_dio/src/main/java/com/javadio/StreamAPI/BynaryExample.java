package com.javadio.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BynaryExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        BinaryOperator<Integer> somar = (num1, num2) ->num1+num2;
        
        int resultado = numeros.stream()
                               .reduce(0,somar);
        
                               System.out.println("A soma dos numeros e: " + resultado);
    }
}

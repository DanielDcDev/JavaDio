package com.javadio.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class functionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //Function<Integer, Integer> dobrar = numero -> numero *2;

        List<Integer> numeroDobrados = numeros.stream()
        .map(n -> n*2)
        .toList();

        numeroDobrados.forEach(System.out::println);



    }
}

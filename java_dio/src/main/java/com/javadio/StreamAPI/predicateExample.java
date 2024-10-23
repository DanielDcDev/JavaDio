package com.javadio.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java","Kotlin","Python","JavaScript");
    
        Predicate<String> maisDeCincoCaracteres  = palavra ->palavra.length() > 5 ;
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
                System.out.println("");
        palavras.stream() 
                .filter(p ->p.length() < 5)
                .forEach(System.out::println);
    
    }
}

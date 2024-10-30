package com.javadio.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Supplier <String> saudacao = () -> "Ola, Seja Bem-vindo(a)!";

        /*List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(1)
        .collect(Collectors.toList());*/

        //Uma forma mais simples e melhor e assim, dessa forma eu nao preciso nem sequer declarar o suplier
        List<String> listaSaudacoes2 = Stream.generate(()->"Ola eu sou o segundo texto")
        .limit(2)
        .collect(Collectors.toList());

        //listaSaudacoes.forEach(System.out::println);
        listaSaudacoes2.forEach(System.out::println);

    }

}

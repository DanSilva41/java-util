package br.com.danilo.alura.list;

import java.util.*;

public class DesafioColletions {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(53);
        numeros.add(12);
        numeros.add(22);
        numeros.add(2);
        numeros.add(98);
        numeros.add(43);

        numeros.forEach(System.out::println);

        System.out.println("\n Invertendo ordem... \n");
        // Inverter ordem da lista
        Collections.reverse(numeros);
        numeros.forEach(System.out::println);

        System.out.println("\n Embaralhando... \n");
        // Embaralhando elementos da lista
        Collections.shuffle(numeros);
        numeros.forEach(System.out::println);

        System.out.println("\n Rotacionar... \n");
        // Rotacionar elementos da lista
        Collections.rotate(numeros, 3);
        numeros.forEach(System.out::println);
    }
}

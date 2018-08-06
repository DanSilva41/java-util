package br.com.danilo.alura.util;

import java.util.ArrayList;

public class TesteListCapacidadeLimitada {

    public static void main(String[] args) {

        // Lista com os 26 estados brasileiros
        ArrayList<String> lista = new ArrayList<>(26); // capacidade inicial
        lista.add("AC");
        lista.add("AM");
        lista.add("BA");
       //...

        System.out.println(lista);

    }
}

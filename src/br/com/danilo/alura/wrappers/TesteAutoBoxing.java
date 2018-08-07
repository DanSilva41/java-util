package br.com.danilo.alura.wrappers;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoBoxing {

    public static void main(String[] args) {

        int idade = 29;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(idade); //  Autoboxing
    }
}

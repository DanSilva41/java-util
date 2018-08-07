package br.com.danilo.alura.wrappers;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoBoxing {

    public static void main(String[] args) {

        int idade = 29;

        List<Integer> numeros = new ArrayList<>();
        numeros.add(idade); //  Autoboxing

        Integer idadeRef = Integer.valueOf(idade);
        int valor = idadeRef.intValue();

        String str = "10";
        Integer valorStr = Integer.valueOf(str); // Parsing
        int valorStrPrimitivo = Integer.parseInt(str); // Parsing para primitivo
    }
}

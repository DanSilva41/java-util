package br.com.danilo.alura.array;

import java.util.Arrays;
import java.util.List;

public class TestaListString {

    public static void main(String[] args) {

        List<String> argumentos = Arrays.asList(args);
        for (String argumento : argumentos) {
            System.out.println(argumento);
        }

    }
}

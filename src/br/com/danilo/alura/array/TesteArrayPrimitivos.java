package br.com.danilo.alura.array;

public class TesteArrayPrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5]; // inicializa  o array com o valor padrao: 0
//        idades[3] = 1; // atribui valor a uma posicao

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}

package br.com.danilo.alura.util;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;

import java.util.ArrayList;

public class TesteUtil {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta contaCorrente = new ContaCorrente(15644, 1231);
        lista.add(contaCorrente);

        Conta contaPoupanca = new ContaCorrente(32124, 7854);
        lista.add(contaPoupanca);

        System.out.println("Tamanho: "+ lista.size()); // Tamanho da lista

        Conta ref = (Conta) lista.get(0); // Pegando objeto da lista pelo indice
        System.out.println(ref.getNumero());

        lista.remove(1); // Removendo um objeto

        System.out.println("Tamanho: "+ lista.size());

        for (int i = 0; i < lista.size(); i++) { // Iterar - tradicional
            Object object = lista.get(i);
            System.out.println(object);
        }

        System.out.println("--------------");

        for (Object object : lista) {
            System.out.println(object);
        }

    }
}

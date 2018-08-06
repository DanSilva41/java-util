package br.com.danilo.alura.util;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;

import java.util.ArrayList;

public class TesteGenerics {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(15644, 1231);
        lista.add(contaCorrente);

        Conta contaPoupanca = new ContaCorrente(32124, 7854);
        lista.add(contaPoupanca);

        System.out.println("Tamanho: "+ lista.size()); // Tamanho da lista

        Conta ref = lista.get(0); // Nao e' necessario cast explicito
        System.out.println(ref.getNumero());

        lista.remove(1); // Removendo um objeto

        System.out.println("Tamanho: "+ lista.size());

        for (int i = 0; i < lista.size(); i++) { // Iterar - tradicional
            Conta conta = lista.get(i);
            System.out.println(conta);
        }

        System.out.println("--------------");

        for (Conta conta: lista) {
            System.out.println(conta);
        }

    }
}

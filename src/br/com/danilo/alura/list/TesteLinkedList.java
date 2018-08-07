package br.com.danilo.alura.list;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;
import br.com.danilo.alura.herdado.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<>();

        Conta contaCorrente = new ContaCorrente(15644, 1231);
        lista.add(contaCorrente);

        Conta contaPoupanca = new ContaPoupanca(32124, 7854);
        lista.add(contaPoupanca);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

        Conta outraConta = new ContaCorrente(12345, 7890);
        lista.addFirst(outraConta);

        System.out.println();
        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}

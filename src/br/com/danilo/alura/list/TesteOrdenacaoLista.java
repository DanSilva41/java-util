package br.com.danilo.alura.list;

import br.com.danilo.alura.herdado.*;

import java.util.*;

public class TesteOrdenacaoLista {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta + " , Titular: "+ conta.getTitular().getNome());
        }

        System.out.println();

//        lista.sort(new TitularDaCOntaComparator());
//        Collections.sort(lista, new NumeroDaContaComparator());
        Collections.sort(lista);

        for (Conta conta : lista) {
            System.out.println(conta + " , Titular: "+ conta.getTitular().getNome());
        }
    }
}

class TitularDaCOntaComparator implements  Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    // Se o 1 valor for maior = devolver valor POSITIVO
    // Se o 2 valor for maior = devolver valor NEGATIVO
    // Se igual = devolver 0
    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
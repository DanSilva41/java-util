package br.com.danilo.alura.list;

import br.com.danilo.alura.herdado.*;

import java.util.*;

public class TesteLambdas {

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

        // Usando Lambdas

        // 1 forma: Cria uma classe anonima
//        lista.sort( (Conta c1, Conta c2) ->{
//                return c1.getTitular().getNome().compareTo(c1.getTitular().getNome());
//            }
//        );
        // 2 forma: Tambe'm cria uma classe anonima,codigo mais enxuto
        lista.sort((c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome())
        );

        // Normal
//        for (Conta conta : lista) {
//            System.out.println(conta + " , Titular: " + conta.getTitular().getNome());
//        }

        // Usando classe anonima
//        lista.forEach(new Consumer<Conta>() {
//            @Override
//            public void accept(Conta conta) {
//                System.out.println(conta);
//            }
//        });


        lista.forEach((conta) -> System.out.println(conta));
    }
}
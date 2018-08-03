package br.com.danilo.alura.array;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;
import br.com.danilo.alura.herdado.ContaPoupanca;

public class TesteArrayReferenciasVersao02 {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(1214, 3545);
        contas[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca(3454, 9724);
        contas[1] = cp1;

//        Conta ref = contas[0]; // funciona
        ContaPoupanca ref = (ContaPoupanca) contas[1]; // type cast
        System.out.println(cp1.getNumero());
        System.out.println(ref.getNumero());

    }

}

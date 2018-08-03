package br.com.danilo.alura.array;

import br.com.danilo.alura.herdado.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5]; // inicializa 5 posicoes com valores padrao = null

//        for (ContaCorrente conta : contas) {
//            System.out.println(conta); // print null
//        }

        ContaCorrente conta1 = new ContaCorrente(12234, 5612);
        contas[0] = conta1;

        ContaCorrente conta2 = new ContaCorrente(34561, 6559);
        contas[1] = conta2;

//        System.out.println(conta2.getNumero());
        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];
        System.out.println(ref.getNumero());
    }
}

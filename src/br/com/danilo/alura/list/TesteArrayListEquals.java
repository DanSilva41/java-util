package br.com.danilo.alura.list;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(15644, 1231);
        lista.add(contaCorrente);

        Conta contaPoupanca = new ContaCorrente(32124, 7854);
        lista.add(contaPoupanca);

        Conta contaPoupancaCopia = new ContaCorrente(32124, 7854);
        boolean existe = lista.contains(contaPoupancaCopia); // outra referencia

        System.out.println("Ja existe? "+ existe);

        for (Conta conta : lista) {
            if(conta == contaPoupancaCopia) {
                System.out.println("Ja tenho essa conta");
            }
        }

    }
}

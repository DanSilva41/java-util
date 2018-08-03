package br.com.danilo.alura.dinamica;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;

public class TesteGuardadorDeReferencias {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta contaCorrente = new ContaCorrente(15644,1231);
        guardador.adiciona(contaCorrente);

        Conta contaPoupanca = new ContaCorrente(32124,7854);
        guardador.adiciona(contaPoupanca);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}

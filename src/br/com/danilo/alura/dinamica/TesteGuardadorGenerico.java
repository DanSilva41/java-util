package br.com.danilo.alura.dinamica;

import br.com.danilo.alura.herdado.Conta;
import br.com.danilo.alura.herdado.ContaCorrente;

public class TesteGuardadorGenerico {

    public static void main(String[] args) {

        GuardadorGenerico guardador = new GuardadorGenerico();

        Conta contaCorrente = new ContaCorrente(15644, 1231);
        guardador.adiciona(contaCorrente);

        Conta contaPoupanca = new ContaCorrente(32124, 7854);
        guardador.adiciona(contaPoupanca);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);


        Object ref = guardador.getReferencia(1);
        if (ref instanceof Conta) {
            Conta contaRef = (Conta) ref;
            System.out.println(contaRef.getNumero());
        }
    }
}

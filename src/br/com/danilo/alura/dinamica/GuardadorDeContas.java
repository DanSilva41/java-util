package br.com.danilo.alura.dinamica;

import br.com.danilo.alura.herdado.Conta;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int  posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0; // explicito mas nao necessario
    }

    public void adiciona(Conta conta) {
        this.referencias[this.posicaoLivre] = conta;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos(){
        return this.posicaoLivre;
    }

    public Conta getReferencia(int index) {
        return this.referencias[index];
    }
}

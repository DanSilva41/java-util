package br.com.danilo.alura.dinamica;

public class GuardadorGenerico {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorGenerico() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0; // explicito mas nao necessario
    }

    public void adiciona(Object objeto) {
        this.referencias[this.posicaoLivre] = objeto;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int index) {
        return this.referencias[index];
    }
}

package br.com.danilo.alura.herdado;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaPoupanca: Numero: "+ super.getNumero() + ", Agencia: "+ super.getAgencia();
    }
}


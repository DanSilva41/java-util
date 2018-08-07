package br.com.danilo.alura.herdado;

public abstract class Conta implements Comparable<Conta> {

    private static int total;
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        Conta.total++;
//        System.out.println("Estou criando uma conta!");
    }

    public static int getTotal() {
        return total;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            // this.saldo -= valor;
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }

        return false;
    }

    /*
     * Não precisamos de setSaldo(), pois não queremos disponibilizar isto. Somente
     * através do métodos de transação é possível alterar o saldo
     */

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    // Omitir este setter, caso queira
    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    // Omitir este setter, caso queira
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: "+ this.saldo;
    }

    @Override
    public boolean equals(Object object) {
        Conta outraContra = (Conta) object;
        if (this.numero != outraContra.getNumero()) {
            return false;
        } else if (this.agencia != outraContra.getAgencia()) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outraContra) {
        return Double.compare(this.saldo, outraContra.saldo);
    }
}
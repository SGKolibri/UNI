package model;

public abstract class Conta {
    private static int contador = 1000; // Gerador de número de conta
    protected int numeroConta;
    protected double saldo;

    public Conta() {
        this.numeroConta = contador++;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    @Override
    public String toString() {
        return "Conta: " + numeroConta + " | Saldo: " + saldo;
    }
}
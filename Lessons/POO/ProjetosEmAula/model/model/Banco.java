package model;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null; // Conta não encontrada
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public static void main(String[] args) {
        // Create a Banco instance
        Banco banco = new Banco("Banco Central");

        // Create two anonymous subclasses of Conta for testing since Conta is abstract
        Conta conta1 = new Conta() {
            @Override
            public void sacar(double valor) {
                if (valor <= saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            }

            @Override
            public void depositar(double valor) {
                saldo += valor;
            }
        };

        Conta conta2 = new Conta() {
            @Override
            public void sacar(double valor) {
                if (valor <= saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            }

            @Override
            public void depositar(double valor) {
                saldo += valor;
            }
        };

        // Add accounts to banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Test the deposit and withdraw methods
        System.out.println("\nTestando deposito e retiro...");
        conta1.depositar(500.0);
        System.out.println("Conta1 saldo depois de depositar 500: " + conta1.getSaldo());

        conta1.sacar(200.0);
        System.out.println("Conta1 saldo depois de retirar 200: " + conta1.getSaldo());

        conta2.depositar(1000.0);
        System.out.println("Conta2 saldo depois de depositar 1000: " + conta2.getSaldo());

        // Test getters
        System.out.println("\nTestando getters...");
        System.out.println("Conta1 - NumeroConta: " + conta1.getNumeroConta() + " | Saldo: " + conta1.getSaldo());
        System.out.println("Conta2 - NumeroConta: " + conta2.getNumeroConta() + " | Saldo: " + conta2.getSaldo());

        // Test buscarConta method
        System.out.println("\nTestando buscarConta...");
        Conta contaBuscada = banco.buscarConta(conta1.getNumeroConta());
        System.out.println("Conta found: " + contaBuscada);

        // Test listarContas method
        System.out.println("\nListando todas contas no Banco:");
        banco.listarContas();
    }
}

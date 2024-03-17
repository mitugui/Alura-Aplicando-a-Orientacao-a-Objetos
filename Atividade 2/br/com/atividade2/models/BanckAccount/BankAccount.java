package br.com.atividade2.models.BanckAccount;

public class BankAccount {
    protected double balance;

    public void setBalance(double balance) {
        this.balance += balance;
        System.out.println("Depósito de " + balance + " realizado. Saldo atual: " + this.balance);

    }

    public void withdrawBalance(double balance) {
        if (balance <= this.balance) {
            this.balance -= balance;
            System.out.println("Saque de " + balance + " realizado. Saldo atual: " + this.balance);
        } else {
            System.out.println("\"Saldo insuficiente para saque.");
        }

    }

    public void getBalance() {
        System.out.println("Saldo atual: " + balance);
    }
}
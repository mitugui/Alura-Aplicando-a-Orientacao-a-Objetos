package br.com.atividade2.models.BanckAccount;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        BankAccount myAccount = new BankAccount();
        myAccount.setBalance(1000);
        // myAccount.getBalance();

        // Realizando operações na conta corrente
        CheckingAccount myCheckingAccount = new CheckingAccount();
        myCheckingAccount.setBalance(200);
        myCheckingAccount.chargeMonthlyFee();
        // myCheckingAccount.getBalance();
        myCheckingAccount.withdrawBalance(150);
        // myCheckingAccount.getBalance();
    }
}

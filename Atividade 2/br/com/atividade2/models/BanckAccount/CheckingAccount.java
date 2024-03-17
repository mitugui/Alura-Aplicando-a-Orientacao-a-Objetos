package br.com.atividade2.models.BanckAccount;

public class CheckingAccount extends BankAccount {
    private double monthlyFee = 50;
    
    public void chargeMonthlyFee() {
        balance -= monthlyFee;
        System.out.println("Tarifa mensal de " + monthlyFee + " cobrada. Saldo atual: " + balance);
    }
}

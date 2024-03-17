package br.com.atividade2.models.PrimeNumbers;

public class CheckPrime extends PrimeNumbers {
    public void checkIfPrime(int number) {
        if (checkPrimality(number)) {
            System.out.println(number + " é primo.");
        } else {
            System.out.println(number + " não é primo.");
        }
    }
}
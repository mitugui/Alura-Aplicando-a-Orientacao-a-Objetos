package br.com.atividade2.models.PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        CheckPrime verifier = new CheckPrime();
        verifier.checkIfPrime(17);

        PrimeGenerator generator = new PrimeGenerator();
        int nextPrime = generator.generateNextPrime(17);
        System.out.println("O próximo primo após 17 é: " + nextPrime);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(30);
    }
}

package br.com.atividade2.models.PrimeNumbers;

public class PrimeGenerator extends PrimeNumbers {
    public int generateNextPrime(int lastPrimeKnown) {
        int nextNumber = lastPrimeKnown + 1;
        while (!checkPrimality(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }
}
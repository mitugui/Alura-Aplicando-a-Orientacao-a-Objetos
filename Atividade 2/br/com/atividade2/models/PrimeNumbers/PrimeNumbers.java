package br.com.atividade2.models.PrimeNumbers;

public class PrimeNumbers {
    public boolean checkPrimality(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void listPrimes(int limit) {
        System.out.println("Números primos até " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            if (checkPrimality(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

package ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        System.out.printf("1 cel para fahr: %.1f\n1 fahr para cel: %.1f ", conversor.celciusParaFahrenheit(1), conversor.fahrenheitParaCelcius(1));
    }
}

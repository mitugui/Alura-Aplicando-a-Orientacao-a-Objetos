package ConversorMoeda;
public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5;
        double valorReal = valorDolar * cotacaoDolar;

        System.out.println("O valor em real de " + valorDolar + " é de " +  valorReal);
    }
    
}
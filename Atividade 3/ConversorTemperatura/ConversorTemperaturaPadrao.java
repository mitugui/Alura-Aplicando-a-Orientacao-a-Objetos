package ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celciusParaFahrenheit(double temperaturaEmCelcius) {
        return temperaturaEmCelcius * 9 / 5 + 32;
    }

    @Override
    public double fahrenheitParaCelcius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) * 5 / 9;
    }
    
}

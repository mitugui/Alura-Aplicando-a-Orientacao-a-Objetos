package br.com.atividade2.models.Car;

public class Car {
    private String model;
    private double priceYearOne;
    private double priceYearTwo;
    private double priceYearThree;

    public void setModel(String model) {
        this.model = model;
    }
    
    public void setPrices(double priceYearOne, double priceYearTwo, double priceYearThree) {
        this.priceYearOne = priceYearOne;
        this.priceYearTwo = priceYearTwo;
        this.priceYearThree = priceYearThree;
    }

    public void displayInfo () {
        System.out.println("Modelo: " + model);
        System.out.printf("Preço Ano 1: %.2f\n", priceYearOne);
        System.out.printf("Preço Ano 2: %.2f\n", priceYearTwo);
        System.out.printf("Preço Ano 3: %.2f\n", priceYearThree);
        System.out.printf("Menor preço: %.2f\n", calculateLower());
        System.out.printf("Maior preço: %.2f\n", calculateHigher());
    }

    private double calculateHigher () {
        double higher;

        higher = Math.max(priceYearOne, priceYearTwo);
        higher = Math.max(higher, priceYearThree);

        return higher;
    }

    private double calculateLower () {
        double lower;

        lower = Math.min(priceYearOne, priceYearTwo);
        lower = Math.min(lower, priceYearThree);

        return lower;
    }
}
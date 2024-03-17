package br.com.atividade2.models.Car;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setModel("Astra");
        myCar.setPrices(26000, 215000, 2400);
        myCar.displayInfo();
    }
}

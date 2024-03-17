package br.com.atividade2.models.Animal;

public class Dog extends Animal{
    @Override
    public void playSound() {
        System.out.println("AUAUAUAUAU");
    }

    public void wagTail() {
        System.out.println("Cachorro abana o rabo");
    }
}
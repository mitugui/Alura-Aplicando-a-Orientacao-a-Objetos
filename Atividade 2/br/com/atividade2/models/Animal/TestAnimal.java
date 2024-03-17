package br.com.atividade2.models.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Dog cachorro = new Dog();
        cachorro.playSound();
        cachorro.wagTail();

        Cat gato = new Cat();
        gato.playSound();
        gato.scratchForniture();
    }
}
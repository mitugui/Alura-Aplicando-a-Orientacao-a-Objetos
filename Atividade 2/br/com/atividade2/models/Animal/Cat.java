package br.com.atividade2.models.Animal;

public class Cat extends Animal{
    @Override
    public void playSound() {
        System.out.println("Miauuuu");
    }

    public void scratchForniture() {
        System.out.println("Gato arranhando móveis");
    }
}
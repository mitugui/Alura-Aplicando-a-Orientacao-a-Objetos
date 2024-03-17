package br.com.mysongs.models;

public class MyFavorites {
    public void includes (Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTittle() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTittle() + " também é um dos que todo mundo está curtindo");
        }
    }
}

package br.com.mysongs.main;

import br.com.mysongs.models.MyFavorites;
import br.com.mysongs.models.Music;
import br.com.mysongs.models.Podcast;

public class Main {
    public static void main(String[] args) throws Exception {
        Music myMusic = new Music();

        myMusic.setTittle("Let It Happen");
        myMusic.setArtist("Tame Impala");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();

        myPodcast.setTittle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites myFavorite = new MyFavorites();

        myFavorite.includes(myMusic);
        myFavorite.includes(myPodcast);
    }
}

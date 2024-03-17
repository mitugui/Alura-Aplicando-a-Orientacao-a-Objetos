package br.com.screenmatch.models;

import br.com.screenmatch.calculation.Classifiable;

public class Film extends Titulo implements Classifiable{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
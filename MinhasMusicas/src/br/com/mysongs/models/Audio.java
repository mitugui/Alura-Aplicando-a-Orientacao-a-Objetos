package br.com.mysongs.models;

public class Audio {
    private String tittle;
    private int duration;
    private int totalPlays;
    private int totalLikes;
    private int classification;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification () {
        return classification;
    }

    public void like() {
        totalLikes++;
    }

    public void play() {
        totalPlays++;
    }
}

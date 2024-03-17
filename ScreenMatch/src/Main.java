import br.com.screenmatch.calculation.RecommendationFilter;
import br.com.screenmatch.calculation.TimeCalculator;
import br.com.screenmatch.models.Episode;
import br.com.screenmatch.models.Film;
import br.com.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Film favoriteMovie = new Film();
        Film otherMovie = new Film();
        Serie favoriteSerie = new Serie();

        // Setando
        favoriteMovie.setName("The Matrix");
        favoriteMovie.setReleaseYear(1999);
        ;
        favoriteMovie.setDurationInMinutes(135);
        favoriteMovie.setIncludedInPlan(true);

        otherMovie.setName("John Wick");
        otherMovie.setReleaseYear(2014);
        ;
        otherMovie.setDurationInMinutes(101);
        favoriteMovie.setIncludedInPlan(true);

        favoriteSerie.setName("The Office");
        favoriteSerie.setReleaseYear(2005);
        favoriteSerie.setIncludedInPlan(true);
        favoriteSerie.setActive(false);
        favoriteSerie.setSeasons(9);
        favoriteSerie.setEpisodesPerSeason(22);
        favoriteSerie.setMinutesPerEpisode(40);

        // Atribuindo nota
        // favoriteMovie.displayTechnicalSheet();
        // favoriteMovie.setRating(9.4);
        // favoriteMovie.setRating(10);
        // favoriteMovie.setRating(8.8);

        // Media
        // System.out.printf("A média ficou: %.1f", favoriteMovie.getAverage());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(favoriteMovie);
        calculator.include(otherMovie);
        calculator.include(favoriteSerie);
        System.out.println("Tempo total para maratonar: " + calculator.getTotalTime());

        Episode pilot = new Episode();
        pilot.setNumber(1);
        pilot.setSerie(favoriteSerie);
        pilot.setTotalViews(300);

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(favoriteMovie);
        filter.filter(otherMovie);
        filter.filter(pilot);
    }
}

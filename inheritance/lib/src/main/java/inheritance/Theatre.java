package inheritance;

import java.util.ArrayList;

public class Theatre extends Business {
    public String name;
    ArrayList<String> movies;

    public Theatre(String name, int stars, int price) {
        super(name,stars,price);
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movieTitle){
        movies.add(movieTitle);
    }

    public void removeMovie(String movieTitle){
        movies.remove(movieTitle);
    }

    public ArrayList<String> getMovies(){
        return movies;
    }

    public String toString(){
        return String.format("Theatre: %s \n Stars: %d", this.name, this.stars);
    }
}
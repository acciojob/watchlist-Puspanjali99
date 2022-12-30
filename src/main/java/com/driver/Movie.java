package com.driver;

public class Movie {
    private String name;
    private int durationInMinutes;
    private double imdbRating;


    public Movie(String name, int numberOfMovie, double imdbRating) {
        this.name = name;
        this.durationInMinutes = numberOfMovie;
        this.imdbRating = imdbRating;
    }
    public Movie(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovie() {
        return durationInMinutes;
    }

    public void setNumberOfMovie(int numberOfMovie) {
        this.durationInMinutes = numberOfMovie;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}

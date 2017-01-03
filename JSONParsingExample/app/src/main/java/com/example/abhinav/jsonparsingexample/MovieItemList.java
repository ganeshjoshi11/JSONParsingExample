package com.example.abhinav.jsonparsingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MovieItemList {
    private String movieTitle, movieReleaseDate;
    private float movieRatings;
    private int moviePosterUrl;

    public MovieItemList(String movieTitle, int moviePosterUrl, String movieReleaseDate, float movieRatings) {
        this.movieTitle = movieTitle;
        this.moviePosterUrl = moviePosterUrl;
        this.movieReleaseDate = movieReleaseDate;
        this.movieRatings = movieRatings;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMoviePosterUrl() {
        return moviePosterUrl;
    }

    public void setMoviePosterUrl(int moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public float getMovieRatings() {
        return movieRatings;
    }

    public void setMovieRatings(float movieRatings) {
        this.movieRatings = movieRatings;
    }
}
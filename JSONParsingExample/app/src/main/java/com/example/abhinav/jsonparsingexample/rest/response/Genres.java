package com.example.abhinav.jsonparsingexample.rest.response;

/**
 * Created by abhinav on 1/1/17.
 */
import com.google.gson.annotations.SerializedName;


public class Genres {

    @SerializedName("id")
    private int genreId;

    @SerializedName("name")
    private String genreName;

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
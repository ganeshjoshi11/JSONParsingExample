package com.example.abhinav.jsonparsingexample.rest;

import com.example.abhinav.jsonparsingexample.rest.response.MovieListing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by abhinav on 1/1/17.
 */
public interface MovieListingService {

    @GET("upcoming")
    Call<MovieListing> getUpcomingMovies(@Query("api_key") String apiKey);
}

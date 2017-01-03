package com.example.abhinav.jsonparsingexample.rest;

import com.example.abhinav.jsonparsingexample.rest.response.MovieListing;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhinav on 1/1/17.
 */
public class RetrofitManager {
    public static Retrofit retrofit = null;
    public static MovieListingService movieListingService = null;
    public static RetrofitManager retrofitManager = null;
    private static String BASE_URL = "https://api.themoviedb.org/3/movie/";

    private RetrofitManager(){
        /*HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)*/
        OkHttpClient client = new OkHttpClient.Builder().build();
         retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .client(client)
                 .build();
        movieListingService = retrofit.create(MovieListingService.class);
    }
    public static RetrofitManager getInstance(){
        if(retrofitManager == null){
            retrofitManager = new RetrofitManager();
        }
        return retrofitManager;
    }
    public static void getUpcomingMovieList(String apiKey, retrofit2.Callback<MovieListing> getMovieListingCallBack){
        Call<MovieListing> getMovieListing = movieListingService.getUpcomingMovies(apiKey);
        getMovieListing.enqueue(getMovieListingCallBack);
    }

//    public void getMovieList(String tmdbmovieapikey, Callback<MovieListing> callback) {
//    }
}

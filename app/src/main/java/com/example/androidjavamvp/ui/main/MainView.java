package com.example.androidjavamvp.ui.main;

import com.example.androidjavamvp.models.MovieResponse;

public interface MainView {

    void showToast(String s);

    void showProgressBar();

    void hideProgressBar();

    void displayMovies(MovieResponse movieResponse);

    void displayError(String s);
}

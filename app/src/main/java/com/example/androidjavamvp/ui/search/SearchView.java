package com.example.androidjavamvp.ui.search;

import com.example.androidjavamvp.models.MovieResponse;

public interface SearchView {

    void showToast(String str);

    void displayResult(MovieResponse movieResponse);

    void displayError(String s);

    void showProgressBar();

    void hideProgressBar();
}

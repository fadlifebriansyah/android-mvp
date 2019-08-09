package com.example.androidjavamvp.ui.search;

import android.support.v7.widget.SearchView;

public interface SearchPresenter {
    void getResultsBasedOnQuery(SearchView searchView);
}

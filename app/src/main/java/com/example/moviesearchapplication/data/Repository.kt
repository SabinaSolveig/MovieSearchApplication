package com.example.moviesearchapplication.data

import com.example.moviesearchapplication.model.Movie

interface Repository {
    fun getMovieFromServer(): Movie
    fun getMovieFromLocalStorage(): Movie
}

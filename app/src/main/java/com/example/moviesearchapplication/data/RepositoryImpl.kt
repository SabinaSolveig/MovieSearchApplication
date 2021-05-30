package com.example.moviesearchapplication.data

import com.example.moviesearchapplication.model.Movie

class RepositoryImpl : Repository {
    override fun getMovieFromServer(): Movie {
        return Movie()
    }

    override fun getMovieFromLocalStorage(): Movie {
        return Movie()
    }

}
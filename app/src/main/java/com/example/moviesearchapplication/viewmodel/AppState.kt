package com.example.moviesearchapplication.viewmodel

import com.example.moviesearchapplication.model.Movie

sealed class AppState {
    data class Success(val movieData: Movie) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}

package com.example.moviesearchapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesearchapplication.data.RepositoryImpl
import java.lang.Thread.sleep

class MoviesViewModel(private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
                      private val repositoryImpl: RepositoryImpl = RepositoryImpl()) : ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getMovie() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(AppState.Success(repositoryImpl.getMovieFromLocalStorage()))
        }.start()
    }
}
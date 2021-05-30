package com.example.moviesearchapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.moviesearchapplication.R
import com.example.moviesearchapplication.model.Movie
import com.example.moviesearchapplication.viewmodel.AppState
import com.example.moviesearchapplication.viewmodel.MoviesViewModel
import com.google.android.material.snackbar.Snackbar

class MoviesListFragment : Fragment(){

    companion object {
        fun newInstance() : MoviesListFragment = MoviesListFragment()
    }

    private lateinit var viewModel: MoviesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MoviesViewModel :: class.java)

    }

    private fun setData(movie: Movie) {

    }



}
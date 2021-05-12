package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.model.MovieModel;
import com.kbiters.fmovieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public ArrayList<MovieModel> getMovies() {
        return (ArrayList<MovieModel>) this.movieRepository.findAll();
    }

    public MovieModel saveMovie(MovieModel movie) {
        return this.movieRepository.save(movie);
    }
}
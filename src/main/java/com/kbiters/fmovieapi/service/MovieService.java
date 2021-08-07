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
        return (ArrayList<MovieModel>) movieRepository.findAll();
    }

    public MovieModel getMovie(Long id) {
        return movieRepository.findById(id).orElseThrow();
    }

    public MovieModel saveMovie(MovieModel movie) {
        return movieRepository.save(movie);
    }

    public MovieModel updateMovie(MovieModel newMovie, Long id) {

        return movieRepository.findById(id).map(movie -> {
            movie.setTitle(newMovie.getTitle());
            movie.setOverview(newMovie.getOverview());
            movie.setRate(newMovie.getRate());
            movie.setTrailer(newMovie.getTrailer());
            movie.setImage(newMovie.getImage());
            movie.setLanguage(newMovie.getLanguage());
            movie.setDuration(newMovie.getDuration());
            movie.setReleaseDate(newMovie.getReleaseDate());
            movie.setAdult(newMovie.isAdult());
            movie.setGenre(newMovie.getGenre());
            movie.setDirectors(newMovie.getDirectors());
            movie.setActors(newMovie.getActors());
            return movieRepository.save(movie);
        }).orElseGet(() -> {
            newMovie.setId(id);
            return movieRepository.save(newMovie);
        });
    }

    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }

}

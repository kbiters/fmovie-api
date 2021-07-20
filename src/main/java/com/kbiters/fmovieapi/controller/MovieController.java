package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.MovieModel;
import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping()
    public ArrayList<MovieModel> getMovies() {
        return movieService.getMovies();
    }

    @GetMapping("/{id}")
    public MovieModel getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @PostMapping()
    public MovieModel saveMovie(@RequestBody MovieModel movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping("/{id}")
    public MovieModel updateMovie(@RequestBody MovieModel newMovie, @PathVariable Long id) {
        return movieService.updateMovie(newMovie, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }

}

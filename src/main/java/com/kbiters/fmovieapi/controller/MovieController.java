package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.MovieModel;
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

}

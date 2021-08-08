package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.MovieModel;
import com.kbiters.fmovieapi.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    IMovieService movieService;

    @GetMapping()
    public ResponseEntity<List<MovieModel>> getMovies() {
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieModel> getMovie(@PathVariable Long id) {
        return movieService.getOne(id);
    }

    @PostMapping()
    public ResponseEntity<MovieModel> saveMovie(@RequestBody MovieModel movie) {
        return movieService.create(movie);
    }

    @PutMapping()
    public ResponseEntity<MovieModel> updateMovie(@RequestBody MovieModel movie) {
        return movieService.create(movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteMovie(@PathVariable Long id) {
        return movieService.delete(id);
    }

}

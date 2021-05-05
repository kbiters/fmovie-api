package com.kbiters.fmovie_api.model;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
public class DirectorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private ArrayList<String> movies;


    public DirectorModel() {
        this.movies = new ArrayList<>();
    }

    public DirectorModel(String name) {
        this.name = name;
    }


    public Long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getMovies() {
        return this.movies;
    }


    public void addMovie(String movie) {
        this.movies.add(movie);
    }
}
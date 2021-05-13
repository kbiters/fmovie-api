package com.kbiters.fmovieapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "director")
public class DirectorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(targetEntity = MovieModel.class, mappedBy = "director")
    @Column
    @JsonManagedReference
    private Set<MovieModel> movies;




    public DirectorModel() {
    }

    public DirectorModel(Long id, String name, Set<MovieModel> movies) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MovieModel> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieModel> movies) {
        this.movies = movies;
    }

}
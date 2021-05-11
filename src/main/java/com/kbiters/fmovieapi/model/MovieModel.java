package com.kbiters.fmovieapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="movies")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String overview;

    public MovieModel() {
    }

    public MovieModel(Long id, String title, String overview) {
        this.id = id;
        this.title = title;
        this.overview = overview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}

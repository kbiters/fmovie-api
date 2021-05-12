package com.kbiters.fmovieapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String overview;

    @Column(nullable = false)
    private int rate;

    @Column(nullable = false)
    private String trailer;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private int duration;

    @Column(nullable = false)
    private Date releaseDate;

    @Column(nullable = false)
    private boolean adult;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String actors;

    public MovieModel() {
    }

    public MovieModel(Long id, String title, String overview, int rate, String trailer, String image, String language, int duration, Date releaseDate, boolean adult, String genre, String director, String actors) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.rate = rate;
        this.trailer = trailer;
        this.image = image;
        this.language = language;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.adult = adult;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
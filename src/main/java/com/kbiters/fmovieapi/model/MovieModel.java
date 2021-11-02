package com.kbiters.fmovieapi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieID;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String overview;

    @Column(nullable = false)
    private float rate;

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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_director",
            joinColumns = {@JoinColumn(name = "movieID")},
            inverseJoinColumns = {@JoinColumn(name = "directorID")}
    )
    private Set<DirectorModel> directors = new HashSet<>();


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_actor",
            joinColumns = {@JoinColumn(name = "movieID")},
            inverseJoinColumns = {@JoinColumn(name = "actorID")}
    )
    private Set<ActorModel> actors = new HashSet<>();


    public MovieModel() {
    }

    public MovieModel(Long movieID, String title, String overview, float rate,
                      String trailer, String image, String language, int duration,
                      Date releaseDate, boolean adult, String genre,
                      Set<DirectorModel> directors, Set<ActorModel> actors) {

        this.movieID = movieID;
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
        this.directors = directors;
        this.actors = actors;

    }

    public Long getId() {
        return movieID;
    }

    public void setId(Long movieID) {
        this.movieID = movieID;
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

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
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


    public Set<DirectorModel> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<DirectorModel> directors) {
        this.directors = directors;
    }

    public Set<ActorModel> getActors() {
        return actors;
    }

    public void setActors(Set<ActorModel> actors) {
        this.actors = actors;
    }
}

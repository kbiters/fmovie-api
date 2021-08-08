package com.kbiters.fmovieapi.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue
    private Long userID;

    @Column(nullable = false, unique = true, updatable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_movie",
            joinColumns = {@JoinColumn(name = "userID")},
            inverseJoinColumns = {@JoinColumn(name = "movieID")}
    )
    private Set<MovieModel> playlist = new HashSet<>();

    public UserModel() {
    }

    public UserModel(String email, String password, Set<MovieModel> playlist) {
        this.email = email;
        this.password = password;
        this.playlist = playlist;
    }

    public Long getId() {
        return userID;
    }

    public void setId(Long userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<MovieModel> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Set<MovieModel> playlist) {
        this.playlist = playlist;
    }
}

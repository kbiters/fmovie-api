package com.kbiters.fmovieapi.model;

import javax.persistence.*;


@Entity
@Table(name = "directors")
public class DirectorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long directorID;

    @Column(nullable = false)
    private String name;


    public DirectorModel() {
    }

    public DirectorModel(Long directorID, String name) {
        this.directorID = directorID;
        this.name = name;
    }

    public Long getId() {
        return directorID;
    }

    public void setId(Long directorID) {
        this.directorID = directorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
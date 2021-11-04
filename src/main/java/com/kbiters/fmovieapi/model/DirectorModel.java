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

    @Column(nullable = false)
    private String lastName;


    public DirectorModel() {
    }

    public DirectorModel(Long directorID, String name, String lastName) {
        this.directorID = directorID;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getDirectorID() {
        return directorID;
    }

    public void setDirectorID(Long directorID) {
        this.directorID = directorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
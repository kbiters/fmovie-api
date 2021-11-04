package com.kbiters.fmovieapi.model;

import javax.persistence.*;


@Entity
@Table(name = "actors")
public class ActorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actorID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    public ActorModel() {
    }

    public ActorModel(Long actorID, String name, String lastName) {
        this.actorID = actorID;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getActorID() {
        return actorID;
    }

    public void setActorID(Long actorID) {
        this.actorID = actorID;
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

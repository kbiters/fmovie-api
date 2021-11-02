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

    public ActorModel() {
    }

    public ActorModel(Long actorID, String name) {
        this.actorID = actorID;
        this.name = name;
    }

    public Long getId() {
        return actorID;
    }

    public void setId(Long actorID) {
        this.actorID = actorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

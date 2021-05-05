package com.kbiters.fmovie_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class ActorModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    public ActorModel() {
    }

    public ActorModel(String name) {
        this.name = name;

    }


    public String getName() {
        return this.name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Actor{" + "id=" + this.id + ", Name=" + this.name +"}";
    }
}

package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.model.ActorModel;
import com.kbiters.fmovieapi.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ActorService {

    @Autowired
    ActorRepository actorRepository;

    public ArrayList<ActorModel> getActors() {
        return (ArrayList<ActorModel>) actorRepository.findAll();
    }

    public ActorModel saveActor(ActorModel actor){
        return actorRepository.save(actor);
    }
}
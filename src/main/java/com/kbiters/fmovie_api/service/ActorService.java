package com.kbiters.fmovie_api.service;

import com.kbiters.fmovie_api.model.ActorModel;
import com.kbiters.fmovie_api.repository.ActorRepository;
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

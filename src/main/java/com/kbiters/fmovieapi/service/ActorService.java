package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.common.GenericService;
import com.kbiters.fmovieapi.model.ActorModel;
import com.kbiters.fmovieapi.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService extends GenericService<ActorModel> implements IActorService {

    @Autowired
    ActorRepository actorRepository;


    @Override
    public JpaRepository<ActorModel, Long> getRepository() {
        return actorRepository;
    }
}

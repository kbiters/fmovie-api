package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.ActorModel;
import com.kbiters.fmovieapi.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/actors")
class ActorController {

    @Autowired
    ActorService actorService;


    @GetMapping()
    public ArrayList<ActorModel> getActor(){
        return actorService.getActors();
    }

    @PostMapping()
    ActorModel newActors(@RequestBody ActorModel newActorModel){
        return this.actorService.saveActor(newActorModel);
    }

}


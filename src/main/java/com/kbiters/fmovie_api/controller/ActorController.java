package com.kbiters.fmovie_api.controller;

import com.kbiters.fmovie_api.model.ActorModel;
import com.kbiters.fmovie_api.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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


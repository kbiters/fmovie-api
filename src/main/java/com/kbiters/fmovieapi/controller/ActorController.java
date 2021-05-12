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

    @GetMapping("/{id}")
    public ActorModel one(@PathVariable Long id){

        return actorService.getActor(id);
    }

    @PutMapping("/{id}")
    public ActorModel updateActor(@RequestBody ActorModel newActor, @PathVariable Long id) {

        return actorService.updateActor(newActor,id);
    }

    @DeleteMapping("/{id}")
    public ActorModel deleteActor(@PathVariable Long id){

        return actorService.deleteActor(id);
    }

}


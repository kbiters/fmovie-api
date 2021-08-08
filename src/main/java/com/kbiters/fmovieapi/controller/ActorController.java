package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.ActorModel;
import com.kbiters.fmovieapi.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/actors")
class ActorController {

    @Autowired
    IActorService actorService;

    @GetMapping()
    public ResponseEntity<List<ActorModel>> getActors() {
        return actorService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorModel> getActor(@PathVariable Long id) {
        return actorService.getOne(id);
    }

    @PostMapping()
    public ResponseEntity<ActorModel> newActors(@RequestBody ActorModel actor) {
        return actorService.create(actor);
    }

    @PutMapping()
    public ResponseEntity<ActorModel> updateActor(@RequestBody ActorModel actor) {
        return actorService.update(actor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteActor(@PathVariable Long id) {
        return actorService.delete(id);
    }

}


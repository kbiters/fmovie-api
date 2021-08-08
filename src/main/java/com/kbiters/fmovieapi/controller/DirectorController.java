package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.DirectorModel;
import com.kbiters.fmovieapi.service.IDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directors")
public class DirectorController {

    @Autowired
    IDirectorService directorService;

    @GetMapping()
    public ResponseEntity<List<DirectorModel>> getDirectors() {
        return directorService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorModel> getDirector(@PathVariable Long id){
        return directorService.getOne(id);
    }

    @PostMapping()
    public ResponseEntity<DirectorModel> saveDirector(@RequestBody DirectorModel director) {
        return directorService.create(director);
    }

    @PutMapping()
    public ResponseEntity<DirectorModel> updateDirector(@RequestBody DirectorModel director){
        return directorService.update(director);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteDirector(@PathVariable Long id) {
        return directorService.delete(id);
    }
}

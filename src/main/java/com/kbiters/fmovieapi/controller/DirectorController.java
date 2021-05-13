package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.DirectorModel;
import com.kbiters.fmovieapi.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/directors")
public class DirectorController {
    @Autowired
    DirectorService directorService;

    @GetMapping()
    public ArrayList<DirectorModel> getDirectors() {
        return directorService.getDirectors();
    }

    @PostMapping()
    public DirectorModel saveMovie(@RequestBody DirectorModel director) {
        return directorService.saveDirector(director);
    }

    @GetMapping("/{id}")
    public DirectorModel getDirector(@PathVariable Long id) {
        return directorService.getDirector(id);
    }

    @PutMapping("/{id}")
    public DirectorModel updateDirector(@RequestBody DirectorModel newDirector, @PathVariable Long id) {
        return directorService.updateDirector(newDirector, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        directorService.deleteDirector(id);
    }
}

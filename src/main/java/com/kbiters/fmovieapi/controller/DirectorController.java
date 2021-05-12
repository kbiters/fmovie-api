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
        return this.directorService.saveDirector(director);
    }
}

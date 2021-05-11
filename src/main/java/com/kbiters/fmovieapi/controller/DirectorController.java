package com.kbiters.fmovieapi.controller;


import com.kbiters.fmovieapi.model.DirectorModel;
import com.kbiters.fmovieapi.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/director")
public class DirectorController {
    @Autowired
    DirectorService directorService;


    public ArrayList<DirectorModel> getDirectors() {
        return directorService.getDirectors();
    }

    @PostMapping()
    public DirectorModel saveMovie(@RequestBody DirectorModel director) {
        return this.directorService.saveDirector(director);
    }
}
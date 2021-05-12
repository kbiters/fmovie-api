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

    @GetMapping("/{id}")
    public DirectorModel getDirector(@PathVariable Long id){
        return this.directorService.getDirector(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/{id}")
    public DirectorModel updateDirector(@RequestBody DirectorModel newDirector, @PathVariable Long id){
        return this.directorService.updateDirector(newDirector, id);
    }

    @DeleteMapping("/employees/{id}")
    public DirectorModel deleteDirector(@PathVariable Long id) {
      return this.directorService.deleteDirector(id);
    }
}

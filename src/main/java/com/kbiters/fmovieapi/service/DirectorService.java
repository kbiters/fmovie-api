package com.kbiters.fmovieapi.service;


import com.kbiters.fmovieapi.model.DirectorModel;
import com.kbiters.fmovieapi.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    
    public ArrayList<DirectorModel> getDirectors() {
        return (ArrayList<DirectorModel>) directorRepository.findAll();
    }

    public DirectorModel saveDirector(DirectorModel director) {
        return directorRepository.save(director);
    }

    public DirectorModel getDirector(Long id) {
        return directorRepository.findById(id);
    }

    public DirectorModel updateDirector(DirectorModel newDirector, Long id) {
        return directorRepository.findById(id).map(director -> {
            director.setName(newDirector.getName());
            return directorRepository.save(director);
        }).orElseGet(() ->{
            newDirector.setId(id);
            return directorRepository.save(newDirector);
        });
    }

    public DirectorModel deleteDirector(Long id) {
        return directorRepository.deleteById(id);
    }
}

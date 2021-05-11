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
}

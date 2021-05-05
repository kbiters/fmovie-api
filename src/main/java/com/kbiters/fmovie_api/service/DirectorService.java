package com.kbiters.fmovie_api.service;


import com.kbiters.fmovie_api.model.DirectorModel;
import com.kbiters.fmovie_api.repository.DirectorRepository;
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

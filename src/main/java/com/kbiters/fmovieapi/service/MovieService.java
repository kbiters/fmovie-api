package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.common.GenericService;
import com.kbiters.fmovieapi.model.MovieModel;
import com.kbiters.fmovieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService extends GenericService<MovieModel> implements IMovieService {

    @Autowired
    MovieRepository movieRepository;


    @Override
    public JpaRepository<MovieModel, Long> getRepository() {
        return movieRepository;
    }
}

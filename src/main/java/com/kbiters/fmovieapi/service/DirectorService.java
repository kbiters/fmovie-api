package com.kbiters.fmovieapi.service;


import com.kbiters.fmovieapi.common.GenericService;
import com.kbiters.fmovieapi.model.DirectorModel;
import com.kbiters.fmovieapi.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DirectorService extends GenericService<DirectorModel> implements IDirectorService {

    @Autowired
    DirectorRepository directorRepository;


    @Override
    public JpaRepository<DirectorModel, Long> getRepository() {
        return directorRepository;
    }
}

package com.kbiters.fmovieapi.repository;

import com.kbiters.fmovieapi.model.DirectorModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DirectorRepository extends JpaRepository<DirectorModel, Long> {

}


package com.kbiters.fmovie_api.repository;

import com.kbiters.fmovie_api.model.DirectorModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DirectorRepository extends JpaRepository<DirectorModel, Long> {

}


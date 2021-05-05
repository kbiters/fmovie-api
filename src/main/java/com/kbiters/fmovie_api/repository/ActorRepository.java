package com.kbiters.fmovie_api.repository;


import com.kbiters.fmovie_api.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository <ActorModel, Integer> {
}

package com.kbiters.fmovieapi.repository;


import com.kbiters.fmovieapi.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository <ActorModel, Long> {
}

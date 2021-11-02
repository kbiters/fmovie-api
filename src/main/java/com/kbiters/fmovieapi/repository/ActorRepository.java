package com.kbiters.fmovieapi.repository;


import com.kbiters.fmovieapi.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<ActorModel, Long> {
}

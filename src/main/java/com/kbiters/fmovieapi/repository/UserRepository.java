package com.kbiters.fmovieapi.repository;


import com.kbiters.fmovieapi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}

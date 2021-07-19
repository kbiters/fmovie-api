package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }
}

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

    public ArrayList<UserModel> getUser() {
        return (ArrayList<UserModel>) this.userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        return this.userRepository.save(user);
    }
}

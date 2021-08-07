package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;
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
        UserModel newUser = new UserModel();
        newUser.setEmail(user.getEmail());
        newUser.setPassword(encryptPassword(user.getPassword()));
        return userRepository.save(newUser);
    }

    public UserModel updateUser(UserModel newUser, Long id) {

        return userRepository.findById(id).map(user -> {
            user.setEmail(newUser.getEmail());
            user.setPassword(encryptPassword(newUser.getPassword()));
            return userRepository.save(user);
        }).orElseGet(() -> {
            newUser.setId(id);
            return userRepository.save(newUser);
        });
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    private String encryptPassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }
}

package com.kbiters.fmovieapi.service;

import com.kbiters.fmovieapi.common.GenericService;
import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.repository.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<UserModel> implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public JpaRepository<UserModel, Long> getRepository() {
        return userRepository;
    }

    @Override
    public ResponseEntity<UserModel> create(UserModel user) {
        user.setPassword(encryptPassword(user.getPassword()));
        return new ResponseEntity<>(getRepository().save(user), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UserModel> update(UserModel user) {
        user.setPassword(encryptPassword(user.getPassword()));
        return new ResponseEntity<>(getRepository().save(user), HttpStatus.OK);
    }


    private String encryptPassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }

}

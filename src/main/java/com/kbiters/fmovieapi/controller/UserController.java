package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping()
    public ResponseEntity<List<UserModel>> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @PostMapping()
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user) {
        return userService.create(user);
    }

    @PutMapping()
    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        return userService.delete(id);
    }
}


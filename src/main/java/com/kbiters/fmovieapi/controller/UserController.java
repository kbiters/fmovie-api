package com.kbiters.fmovieapi.controller;

import com.kbiters.fmovieapi.model.UserModel;
import com.kbiters.fmovieapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

}

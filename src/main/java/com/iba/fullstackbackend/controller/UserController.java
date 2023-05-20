package com.iba.fullstackbackend.controller;

import com.iba.fullstackbackend.model.User;
import com.iba.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {


    @Autowired
    private UserRepository repo;


    @GetMapping("/getUser")
    public List<User> getUser(){
        return repo.findAll();
    }

    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return repo.save(user);
    }



}

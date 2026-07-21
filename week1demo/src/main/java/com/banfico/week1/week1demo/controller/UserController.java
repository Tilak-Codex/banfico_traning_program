package com.banfico.week1.week1demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banfico.week1.week1demo.entity.User;
import com.banfico.week1.week1demo.repo.UserRepo;
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;
    // Creating a post Request to create a new user in the database
    @PostMapping("/createUsers")
   public  void createUser(@RequestBody User user) {
            
        userRepo.save(user);

}
}

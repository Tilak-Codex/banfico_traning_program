package com.banfico.week1.week1demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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



        // To get the user inserted as response we can use the below code instead of void
        /*  public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepo.save(user);
            return ResponseEntity.ok(savedUser);
        }
            */
}

    @PostMapping("/createAll")
    public ResponseEntity<List<User>> createListOfUsers(@RequestBody List<User> users) {
        List<User>savedUsers= userRepo.saveAll(users);
        
        return ResponseEntity.ok(savedUsers);
    }

}

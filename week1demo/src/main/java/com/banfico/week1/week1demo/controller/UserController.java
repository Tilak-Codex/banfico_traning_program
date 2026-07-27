package com.banfico.week1.week1demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banfico.week1.week1demo.entity.User;
import com.banfico.week1.week1demo.repo.UserRepo;
import com.banfico.week1.week1demo.service.UserService;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userSer;
    // Creating a post Request to create a new user in the database
    @PostMapping("/createUsers")
   public  void createUser(@RequestBody User user) {
            
        userSer.createUser(user);



        // To get the user inserted as response we can use the below code instead of void
        /*  public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepo.save(user);
            return ResponseEntity.ok(savedUser);
        }
            */
}

    @PostMapping("/createAll")
    public ResponseEntity<List<User>> createListOfUsers(@RequestBody List<User> users) {
        List<User>savedUsers= userSer.createListOfUsers(users);
        
        return ResponseEntity.ok(savedUsers);
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userSer.getAllUsers();
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user=userSer.getUserById(id);
        if(user!=null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
@PutMapping("/updateUserById/{id}")
    public ResponseEntity<User> updateName(@PathVariable Long id, @RequestBody User updatedData){
        User updatedUser=userSer.updateUserById(id, updatedData);
        if(updatedUser!=null){
            return ResponseEntity.ok(updatedUser);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable Long id){
        User user=userSer.deleteById(id);
        if(user!=null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}

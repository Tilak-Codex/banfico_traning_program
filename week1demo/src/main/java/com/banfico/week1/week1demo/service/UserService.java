package com.banfico.week1.week1demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banfico.week1.week1demo.entity.User;
import com.banfico.week1.week1demo.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User createUser(User user){
        return userRepo.save(user);
    }

    public List<User> createListOfUsers(List<User> users){
         return userRepo.saveAll(users);
    }
public List<User> getAllUsers(){
        return userRepo.findAll();
}

public User getUserById(Long id){
        return userRepo.findById(id).orElse(null);
}

public User updateUserById(Long id,User updateData){
    User existingUser=userRepo.findById(id).orElse(null);
    if(existingUser!=null){
        existingUser.setName(updateData.getName());
        userRepo.save(existingUser);
        return existingUser;
        
    }
    return null;
}
public User deleteById(Long id){
        User existingUser=userRepo.findById(id).orElse(null);

        if(existingUser!=null){
            userRepo.deleteById(id);
            return existingUser;
        }
        return null;
}

}

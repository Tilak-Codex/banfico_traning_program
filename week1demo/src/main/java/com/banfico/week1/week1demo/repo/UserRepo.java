package com.banfico.week1.week1demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banfico.week1.week1demo.entity.User;

// The repository directory contains interfaces that handle all communication with the database

// The repository package (or directory) is used to interact with the database

public interface UserRepo extends JpaRepository<User,Long> {

}

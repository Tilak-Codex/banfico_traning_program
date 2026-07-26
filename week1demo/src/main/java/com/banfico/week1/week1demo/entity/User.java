package com.banfico.week1.week1demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


// An Entity in Spring Boot is a Java class that represents a table in your database.
@ Entity  // This annotation specifies that the class is an entity and is mapped to a database table
@Data    // lombok annotation to generate getters and setters automatically
@Table(name = "users")  // To specify the table name in the database
public class User {

        @Id // Each entity must have a primary key, and the @Id annotation is used to specify the primary key of an entity
        @GeneratedValue(strategy=GenerationType.IDENTITY)  // To auto gen Id values
        private Long id;
        @NotEmpty(message = "Please provide valid name")
        @NotBlank(message = "Please provide name instead of only blank spaces")
        private String name;
}

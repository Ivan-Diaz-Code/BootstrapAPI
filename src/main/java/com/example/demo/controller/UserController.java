package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.persistence.PostUpdate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // api route to save Post without ID
    // api route to update Post with ID
    @PostMapping("/api/user/save")
    public User saveUser(@RequestBody User entity) {

        return userService.saveUser(entity);
    }

    // api route to get a user by the userID
    @GetMapping("/api/user/{userID}")
    public User getUser(@PathVariable int userID) {
        return userService.getUser(userID);
    }

    // api route to delete user with ID
    @PostMapping("/api/user/delete")
    public String deleteUser(@RequestBody User entity) {

        return userService.deleteUser(entity);
    }

}

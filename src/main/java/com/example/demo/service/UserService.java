package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService() {
    }

    public User saveUser(User user) {
        // save user
        return userRepository.save(user);
    }

    public User getUser(int userID) {
        // get user by userID
        return userRepository.findById(userID).orElse(null);
    }

    public String deleteUser(User user) {
        // delete user
        userRepository.delete(user);
        return "User Deleted";
    }
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

//JPA Interface that contains CRUD Calls
public interface UserRepository extends JpaRepository<User, Integer> {
}

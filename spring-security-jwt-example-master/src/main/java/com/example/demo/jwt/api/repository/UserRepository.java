package com.example.demo.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}

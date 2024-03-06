package com.example.springsecuritydemo.repo;

import com.example.springsecuritydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    public User findUserByEmail(String email);
    public User findUserByUserName(String name);
}

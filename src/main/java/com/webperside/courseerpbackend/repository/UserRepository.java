package com.webperside.courseerpbackend.repository;

import com.webperside.courseerpbackend.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Long> {
    Users save(User user);
    Users getUserEnById(int id);
    Optional<Users>findUsersByEmail(String email);

//    Users findAll
}

package com.webperside.courseerpbackend.repository;

import com.webperside.courseerpbackend.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users, Long> {
    Users save(User user);
    Users getUserEnById(int id);

//    Users findAll
}

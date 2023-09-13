package com.webperside.courseerpbackend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity(name = "users")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    String name;
    @Column(length = 50)
    String surname;
    @Column(length = 30)
    String status;
    @Column()
    int role_id;
    @Column()
    String email;
    @Column(length = 20, nullable = false)
    String phone_number;
    @Column(nullable = false)
    String password;
    @Column
    Boolean is_deleted;


}

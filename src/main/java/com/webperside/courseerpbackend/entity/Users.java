package com.webperside.courseerpbackend.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    String name;
    @Column
    String surname;
    @Column
    String status;
    @Column
    int role_id;
    @Column
    String email;
    @Column
    String phone_number;
    @Column
    String password;

//    @ManyToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id" ,referencedColumnName = "id"),
//        inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
//    private List<Role> roles = new ArrayList<>();



}

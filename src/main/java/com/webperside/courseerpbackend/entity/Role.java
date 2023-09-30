package com.webperside.courseerpbackend.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "Roles")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    boolean isDeleted;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "owner_id")
//    private int owner_id;
    }

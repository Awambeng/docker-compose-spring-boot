package com.awambeng.dockercomposespringboot.user;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private int phoneNumber;
}
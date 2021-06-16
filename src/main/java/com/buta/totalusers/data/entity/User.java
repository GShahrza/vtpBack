package com.buta.totalusers.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String names;
    private String surname;
    private int ages;
    private int genderId;
    private int departmentId;
    private String email;
    private String phone;
    private int universityId;
    private int degreeId;
}

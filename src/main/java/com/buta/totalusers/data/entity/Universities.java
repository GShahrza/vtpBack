package com.buta.totalusers.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Universities {
    @Id
    private int id;
    private String names;
}

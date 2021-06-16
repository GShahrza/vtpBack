package com.buta.totalusers.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "university_degree")
@Setter
@Getter
public class UniversityDegree {
    @Id
    private int id;
    private String names;
}

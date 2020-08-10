package com.clean.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    private int ID;
    private String Name;

}

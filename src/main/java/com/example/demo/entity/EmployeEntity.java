package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private int wage;

    public EmployeEntity(){

    }

    public EmployeEntity(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public EmployeEntity(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}

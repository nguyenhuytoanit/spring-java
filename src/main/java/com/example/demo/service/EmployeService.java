package com.example.demo.service;

import com.example.demo.entity.EmployeEntity;

import java.util.List;

public interface EmployeService {
    List<EmployeEntity> getAllEmployee();
    EmployeEntity createEmployee(EmployeEntity p);
}

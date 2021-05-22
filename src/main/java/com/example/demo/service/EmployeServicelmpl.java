package com.example.demo.service;

import com.example.demo.entity.EmployeEntity;
import com.example.demo.respository.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServicelmpl implements EmployeService{

    @Autowired
    EmployeRepo employeRepo;

    @Override
    public List<EmployeEntity> getAllEmployee() {
        return employeRepo.findAll();
    }

    @Override
    public EmployeEntity createEmployee(EmployeEntity p) {
        return employeRepo.save(p);
    }
}

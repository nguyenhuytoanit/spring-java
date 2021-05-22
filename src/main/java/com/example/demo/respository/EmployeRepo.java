package com.example.demo.respository;

import com.example.demo.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<EmployeEntity, Integer> {
}

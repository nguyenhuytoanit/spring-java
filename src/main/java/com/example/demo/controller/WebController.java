package com.example.demo.controller;

import com.example.demo.entity.EmployeEntity;
import com.example.demo.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    EmployeService employeService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<EmployeEntity> employees = employeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/add-employee"})
    public String addEmployee(){
        return "addEmployee";
    }

    @PostMapping({"/createEmployee"})
    public String createEmployee(@RequestParam Map<String, String> params){
        String name = params.get("name");
        int wage =  java.lang.Integer.parseInt(params.get("wage"));

        EmployeEntity employee = new EmployeEntity(name, wage);
        employeService.createEmployee(employee);
        return "redirect:index";
    }
}

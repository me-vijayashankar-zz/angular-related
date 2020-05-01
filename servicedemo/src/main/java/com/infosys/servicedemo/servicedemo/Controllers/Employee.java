package com.infosys.servicedemo.servicedemo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.infosys.servicedemo.servicedemo.Models.EmployeeModel;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/emp")
public class Employee {

    @GetMapping(value = "/get")
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
        employees.add(new EmployeeModel("abc", "vijay", "9688780723"));
        employees.add(new EmployeeModel("abc", "shan", "9600155169"));
        return employees;
    }

}
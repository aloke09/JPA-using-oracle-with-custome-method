package com.bridgelabz.EmpJpa.controller;

import com.bridgelabz.EmpJpa.model.Employee;
import com.bridgelabz.EmpJpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService service;

    @GetMapping("/Employees")
    public List<Employee> viewAll()
    {
        return service.getAll();
    }

    @GetMapping("/Employee/{id}")
    public Employee viewById(@PathVariable int id)
    {
        return service.getById(id);
    }

    @GetMapping("/EmployeeByName/{name}")
    public Employee viewByName(@PathVariable String name)
    {
        return service.getByName(name);
    }

    @PostMapping("/EmployeeInsert")
    public Employee insert(@RequestBody Employee employee)
    {
        return service.insert(employee);
    }

    @DeleteMapping("Employee/{id}")
    public void delById(@PathVariable int id)
    {
        service.deleteById(id);
    }
}

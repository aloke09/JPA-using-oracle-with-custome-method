package com.bridgelabz.EmpJpa.service;

import com.bridgelabz.EmpJpa.model.Employee;
import com.bridgelabz.EmpJpa.repo.EmployeeRepo;
import com.bridgelabz.EmpJpa.repo.EmployeeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepo repo;

    public List<Employee> getAll()
    {
        return repo.findAll();
    }

    public Employee getById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public Employee getByName(String name)
    {
        return repo.findByName(name);
    }

    public Employee insert(Employee employee)
    {
        return repo.save(employee);
    }

    public void deleteById(int id)
    {
        repo.deleteById(id);
    }

    public Employee update(Employee employee)
    {
        Employee existing=repo.findById(employee.getEmpno()).orElse(null);
        existing.setEname(employee.getEname());
        existing.setDeptno(employee.getDeptno());
        existing.setJob(employee.getJob());
        existing.setSal(employee.getSal());
        return repo.save(existing);
    }
}

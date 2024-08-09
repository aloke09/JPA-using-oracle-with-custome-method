package com.bridgelabz.EmpJpa.repo;

import com.bridgelabz.EmpJpa.model.Employee;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public interface EmployeeRepoCustom
{
    Employee findByName(String name);
}

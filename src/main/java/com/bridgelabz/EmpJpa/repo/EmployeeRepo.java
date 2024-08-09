package com.bridgelabz.EmpJpa.repo;

import com.bridgelabz.EmpJpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>,EmployeeRepoCustom
{

}

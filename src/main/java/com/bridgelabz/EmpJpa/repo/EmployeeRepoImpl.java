package com.bridgelabz.EmpJpa.repo;

import com.bridgelabz.EmpJpa.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImpl implements EmployeeRepoCustom
{
    @PersistenceContext
    public EntityManager entityManager;
    public Employee findByName(String name)
    {
        String query = "SELECT e FROM Employee e WHERE e.ename = :name";
        TypedQuery<Employee> typedQuery = entityManager.createQuery(query, Employee.class);
        typedQuery.setParameter("name", name); // Ensure 'name' is used as the parameter

//        return typedQuery.getSingleResult();
        try {
            return typedQuery.getSingleResult();
        } catch (NoResultException e) {
            return null; // or handle as needed
        }
    }
}

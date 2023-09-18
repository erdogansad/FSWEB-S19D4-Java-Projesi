package com.workintech.S19D4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.workintech.S19D4.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Optional<Employee> findByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.salary > :salary ORDER BY salary desc")
    List<Employee> findBySalary(double salary);

    @Query("SELECT e FROM Employee e ORDER BY e.lastName asc")
    List<Employee> findByOrder();

}
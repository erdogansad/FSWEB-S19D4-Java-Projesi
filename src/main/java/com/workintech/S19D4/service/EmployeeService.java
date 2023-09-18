package com.workintech.S19D4.service;

import java.util.List;

import com.workintech.S19D4.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    Employee delete(int id);

    Employee findByEmail(String email);

    List<Employee> findBySalary(double salary);

    List<Employee> findByOrder();
}

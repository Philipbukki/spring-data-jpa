package com.bukkicancode.restcrud.service;

import com.bukkicancode.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int employeeId);
    Employee save(Employee employee);
    void delete(int studId);
}

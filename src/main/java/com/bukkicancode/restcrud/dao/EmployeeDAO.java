package com.bukkicancode.restcrud.dao;

import com.bukkicancode.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int employeeId);
    Employee save(Employee employee);
    void delete(int studId);
}

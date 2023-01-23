package com.enoca.services;

import com.enoca.entities.Employee;

import java.util.List;

public interface EmployeeService {
    // save operation
    Employee saveEmployee(Employee Employee);

    // read operation
    List<Employee> fetchEmployeeList();

    // update operation
    Employee updateEmployee(Employee Employee, Long EmployeeId);

    // delete operation
    void deleteEmployeeById(Long EmployeeId);
}

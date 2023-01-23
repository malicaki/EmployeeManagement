package com.enoca.controllers;

import com.enoca.entities.Employee;
import com.enoca.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    // Annotation
    @Autowired
    private EmployeeService employeeService;

    // Save operation
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Read operation
    @GetMapping("/employees")
    public List<Employee> fetchEmployeeList() {
        return employeeService.fetchEmployeeList();
    }

    // Update operation
    @PutMapping("/employees/{id}")
    public Employee
    updateEmployee(@RequestBody Employee employee,
                   @PathVariable("id") Long employeeId) {
        return employeeService.updateEmployee(employee, employeeId);
    }

    // Delete operation
    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable("id")
                                     Long employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Deleted Successfully";
    }
}

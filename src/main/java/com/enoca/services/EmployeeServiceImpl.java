package com.enoca.services;

import com.enoca.entities.Employee;
import com.enoca.repos.EmployeeRepository;
import com.enoca.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    // save operation
    @Override
    public Employee saveEmployee(Employee Employee) {
        return EmployeeRepository.save(Employee);
    }

    // read operation
    @Override
    public List<Employee> fetchEmployeeList() {
        return (List<Employee>) EmployeeRepository.findAll();
    }

    // update operation
    @Override
    public Employee updateEmployee(Employee Employee, Long EmployeeId) {
        Employee depDB = EmployeeRepository.findById(EmployeeId).get();
        return EmployeeRepository.save(depDB);
    }

    // delete operation
    @Override
    public void deleteEmployeeById(Long EmployeeId) {
        EmployeeRepository.deleteById(EmployeeId);
    }
}

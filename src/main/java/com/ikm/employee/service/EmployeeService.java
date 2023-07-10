package com.ikm.employee.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikm.employee.model.Employee;
import com.ikm.employee.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeInterface {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employeeData) {
        return employeeRepository.save(employeeData);
    }
}
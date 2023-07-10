package com.ikm.employee.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikm.employee.model.Employee;
import com.ikm.employee.repository.EmployeeRepository;
import com.ikm.employee.service.EmployeeService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    EmployeeService employeeService;

   
    // public EmployeeController(EmployeeRepository employeeRepository) {
    //     this.employeeRepository = employeeRepository;
    // }

    @PostMapping(value = "/citizen")
    public ResponseEntity<String> createEmployee(@Valid @RequestBody  Employee employeeData) {
        if (employeeData.getName() == null){
            return new ResponseEntity("Name must not be Blank", HttpStatus.BAD_REQUEST);
        }
        if (employeeData.getAddress().getHousename() == null){
            return new ResponseEntity("House Name must not be Blank",HttpStatus.BAD_REQUEST);
        }

        else{
            Employee data = employeeRepository.save(employeeData);
            
            return ResponseEntity.status(HttpStatus.CREATED)
                    .header("Location", "/api/v1/citizen/" + data)
                    .body("Employee created");
                    

        }
    }
}

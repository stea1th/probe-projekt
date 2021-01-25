package de.stea1th.probeserver.controller;

import de.stea1th.probeserver.entity.Employee;
import de.stea1th.probeserver.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.get(id), HttpStatus.OK);
    }
}

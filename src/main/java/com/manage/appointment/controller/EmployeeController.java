package com.manage.appointment.controller;

import com.manage.appointment.dto.EmployeeDTO;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.service.serviceImp.EmployeeServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImp employeeService;

    @PostMapping("/register")
    public ResponseEntity<Employee> registerEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee registered = employeeService.registerEmployee(employeeDTO);
        return ResponseEntity.ok(registered);
    }
}
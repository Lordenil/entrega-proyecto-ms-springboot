package com.manage.appointment.service.serviceImp;

import com.manage.appointment.dto.EmployeeDTO;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.repository.EmployeeRepository;

import com.manage.appointment.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements IEmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee registerEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        return employeeRepository.save(employee);
    }
}

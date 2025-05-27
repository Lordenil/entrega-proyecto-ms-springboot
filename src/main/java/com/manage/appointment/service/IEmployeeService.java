package com.manage.appointment.service;

import com.manage.appointment.dto.EmployeeDTO;
import com.manage.appointment.entity.Employee;

public interface IEmployeeService {
    public Employee registerEmployee(EmployeeDTO employee);

}
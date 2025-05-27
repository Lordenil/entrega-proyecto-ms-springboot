package com.manage.appointment.repository;

import com.manage.appointment.entity.Employee;
import com.manage.appointment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

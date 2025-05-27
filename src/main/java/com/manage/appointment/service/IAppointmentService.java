package com.manage.appointment.service;

import com.manage.appointment.dto.AppointmentDTO;
import com.manage.appointment.dto.UserDTO;
import com.manage.appointment.entity.Appointment;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.entity.User;
import com.manage.appointment.repository.AppointmentRepository;
import com.manage.appointment.repository.EmployeeRepository;
import com.manage.appointment.repository.UserRepository;
import jakarta.transaction.Transactional;

public interface IAppointmentService {
    public Appointment createAppointment(AppointmentDTO appointmentDTO);
}
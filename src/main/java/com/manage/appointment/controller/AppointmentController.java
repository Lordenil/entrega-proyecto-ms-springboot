package com.manage.appointment.controller;

import com.manage.appointment.dto.AppointmentDTO;
import com.manage.appointment.dto.EmployeeDTO;
import com.manage.appointment.entity.Appointment;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.service.serviceImp.AppointmentServiceImp;
import com.manage.appointment.service.serviceImp.EmployeeServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentServiceImp appointmentService;

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@Valid @RequestBody AppointmentDTO appointmentDTO) {
        Appointment appointment = appointmentService.createAppointment(appointmentDTO);
        return ResponseEntity.ok(appointment);
    }
}
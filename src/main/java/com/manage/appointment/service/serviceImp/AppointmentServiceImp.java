package com.manage.appointment.service.serviceImp;

import com.manage.appointment.dto.AppointmentDTO;
import com.manage.appointment.entity.Appointment;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.entity.User;
import com.manage.appointment.repository.AppointmentRepository;
import com.manage.appointment.repository.EmployeeRepository;
import com.manage.appointment.repository.UserRepository;
import com.manage.appointment.service.IAppointmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImp implements IAppointmentService {

    final AppointmentRepository appointmentRepository;
    final UserRepository userRepository;
    final EmployeeRepository employeeRepository;

    @Transactional
    public Appointment createAppointment(AppointmentDTO appointmentDTO) {
        User user = userRepository.findById(appointmentDTO.getUserId())
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));

        Employee employee = employeeRepository.findById(appointmentDTO.getEmployeeId())
                .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado"));

        List<Appointment> userAppointments = appointmentRepository.findByUserIdAndDate(user.getId(), appointmentDTO.getDate());
        if (!userAppointments.isEmpty()) {
            throw new IllegalStateException("El usuario ya tiene una cita para ese día");
        }

        boolean conflict = appointmentRepository.existsByEmployeeIdAndDateAndInitialTimeLessThanAndEndTimeGreaterThan(
                appointmentDTO.getEmployeeId(), appointmentDTO.getDate(), appointmentDTO.getEndTime(), appointmentDTO.getInitialTime()
        );

        if (conflict) {
            throw new IllegalStateException("El empleado ya tiene una cita en ese horario");
        }

        Appointment appointment = Appointment.builder()
                .date(appointmentDTO.getDate())
                .initialTime(appointmentDTO.getInitialTime())
                .endTime(appointmentDTO.getEndTime())
                .user(user)
                .employee(employee)
                .build();

        return appointmentRepository.save(appointment);
    }
}
package com.manage.appointment.service.serviceImp;

import com.manage.appointment.dto.ScheduleDTO;
import com.manage.appointment.entity.Employee;
import com.manage.appointment.entity.Schedule;
import com.manage.appointment.repository.EmployeeRepository;
import com.manage.appointment.repository.ScheduleRepository;
import com.manage.appointment.service.IScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImp implements IScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final EmployeeRepository employeeRepository;

    public Schedule createSchedule(ScheduleDTO scheduleDTO) {
        Employee employee = employeeRepository.findById(scheduleDTO.getEmployeeId())
                .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado"));

        Schedule schedule = new Schedule();
        schedule.setDay(scheduleDTO.getDay());
        schedule.setInitialTime(scheduleDTO.getInitialTime());
        schedule.setEndTime(scheduleDTO.getEndTime());
        schedule.setEmployee(employee);

        return scheduleRepository.save(schedule);
    }
}

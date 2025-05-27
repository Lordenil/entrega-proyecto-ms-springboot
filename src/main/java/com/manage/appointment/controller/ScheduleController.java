package com.manage.appointment.controller;

import com.manage.appointment.dto.ScheduleDTO;
import com.manage.appointment.entity.Schedule;
import com.manage.appointment.service.serviceImp.ScheduleServiceImp;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schedules")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleServiceImp scheduleService;

    @PostMapping("/register")
    public ResponseEntity<Schedule> createSchedule(@Valid @RequestBody ScheduleDTO scheduleDTO) {
        Schedule created = scheduleService.createSchedule(scheduleDTO);
        return ResponseEntity.ok(created);
    }
}
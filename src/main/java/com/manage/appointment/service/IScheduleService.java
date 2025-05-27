package com.manage.appointment.service;

import com.manage.appointment.dto.ScheduleDTO;
import com.manage.appointment.entity.Schedule;

public interface IScheduleService {

    public Schedule createSchedule(ScheduleDTO schedule);

}
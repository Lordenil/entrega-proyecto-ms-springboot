package com.manage.appointment.repository;

import com.manage.appointment.entity.Employee;
import com.manage.appointment.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}

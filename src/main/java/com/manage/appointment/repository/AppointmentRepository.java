package com.manage.appointment.repository;

import com.manage.appointment.entity.Appointment;
import com.manage.appointment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByEmployeeIdAndDate(Long employeeId, LocalDate date);

    boolean existsByEmployeeIdAndDateAndInitialTimeLessThanAndEndTimeGreaterThan(
            Long employeeId, LocalDate date, LocalTime endTime, LocalTime initialTime
    );

    @Query("SELECT a FROM Appointment a WHERE a.user.id = :userId AND a.date = :date")
    List<Appointment> findByUserIdAndDate(@Param("userId") Long userId, @Param("date") LocalDate date);
}

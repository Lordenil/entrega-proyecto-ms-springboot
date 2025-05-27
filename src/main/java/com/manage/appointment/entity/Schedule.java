package com.manage.appointment.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "schedules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private DayOfWeek day;
    private LocalTime initialTime;
    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

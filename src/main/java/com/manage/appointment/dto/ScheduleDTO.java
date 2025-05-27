package com.manage.appointment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
    @NotNull(message = "El día no puede ser nulo")
    private DayOfWeek day;

    @NotNull(message = "La hora inicial es obligatoria")
    private LocalTime initialTime;

    @NotNull(message = "La hora final es obligatoria")
    private LocalTime endTime;

    @NotNull(message = "El ID del empleado es obligatorio")
    private Long employeeId;
}

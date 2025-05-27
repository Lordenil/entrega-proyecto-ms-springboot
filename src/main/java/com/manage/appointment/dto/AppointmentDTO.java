package com.manage.appointment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    @NotNull(message = "La fecha de la cita es obligatoria")
    private LocalDate date;

    @NotNull(message = "La hora inicial es obligatoria")
    private LocalTime initialTime;

    @NotNull(message = "La hora final es obligatoria")
    private LocalTime endTime;

    @NotNull(message = "El ID del usuario es obligatorio")
    private Long userId;

    @NotNull(message = "El ID del empleado es obligatorio")
    private Long employeeId;
}

# Sistema de Gestión de Citas

## 📝 Descripción del Proyecto

Este proyecto esta enfocado en la gestions de citas y configuracion de horarios para negocios tipo peluquerias, spa, barberias, entre otros.
En este se tienen las funcionalidades de:

- El registrar empleados
- El registrar usuarios
- Configuracion de horario laboral
- Asignación de citas
- Modulo de reportes

Tecnologías usadas:

- **Spring Boot** como framework principal
- **JPA** para persistencia
- **PostgreSQL** Base de datos local

---

## 📋 Reglas de Negocio

### Configuración Horarios

- **RN1**: Las horas laborales no deben solaparce para un mismo día.
- **RN2**: No se pueden tener registros que pasen al día siguiente.

### Asignación de Citas

- **RN3**: Una cita solo se debe asignar si el empleado esta disponible en el horario.
- **RN4**: El usuario solo puede tener una cita al día.

---

## 📊 Reportes Posibles en la logica

✅ Empleados con mas citas  
✅ Ususarios con mas citas  
✅ Empleado con msa jornada laborar

---

## 📂 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/manage/appointment/
│   │       ├── controller/       # Controladores REST
│   │       ├── dto/              # Data Transfer Object
│   │       ├── entity/           # Entidades JPA
│   │       ├── exception/        # Controle de excepciones
│   │       ├── repository/       # Repositorios Spring Data
│   │       ├── service/          # Lógica de negocio
│   │       │   └── serviceIMP/   # Implementaciones de servicios
│   └── resources/
│       ├── application.properties
│       ├── data.sql              # Datos iniciales
│       └── schema.sql            # Script de esquema base de datos
```

---

## ⚙️ Instrucciones de Instalación

### 📦 Prerrequisitos

- Java 17
- Maven
- IDE (IntelliJ o VSCode)

### ▶️ Pasos para ejecutar

1. Clonar:

git clone https://github.com/Lordenil/appointment-manage.git

2. Ejecutar con JetBrains

3. Configurar las variables de entorno ".ENV"

4. Acceder por consola a la ruta del repositorio "appointment-manage":

5. Ejecutar el comando "docker compose up -d" para subir la base de datos

## 📮 Colección de APIs (Postman)

---

POST
User Create
http://localhost:8080/api/users/registerBody
raw (json)
{
"name": "David",
"email": "david@gmail.com",
"password": "123"
}

---

POST
Employee Create
http://localhost:8080/api/employees/register
raw (json)
{
"name": "Carlos Pérez"
}

---

POST
Schedule Create
http://localhost:8080/api/employees/register
raw (json)
{
"day": "MONDAY",
"initialTime": "08:00:00",
"endTime": "12:00:00",
"employeeId": 1
}

---

POST
Appointment Create
http://localhost:8080/api/appointments
raw (json)
{
"date": "2025-05-28",
"initialTime": "10:00",
"endTime": "11:00",
"userId": 1,
"employeeId": 2
}

---

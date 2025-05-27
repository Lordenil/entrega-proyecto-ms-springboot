
INSERT INTO public.users(
	id, email, name, password)
	VALUES (1, 'david23@gmail.com', David Perez, 123456);
INSERT INTO public.users(
	id, email, name, password)
	VALUES (2, 'camilo33@gmail.com', Camilo Rua, 123456);

INSERT INTO public.employees(
	id, name)
	VALUES (1, 'Duvan Velez');

INSERT INTO public.schedules(
	id, day, end_time, initial_time, employee_id)
	VALUES (1, "MONDAY", "08:00:00", "12:00:00", 1);

INSERT INTO public.appointments(
	id, date, end_time, initial_time, employee_id, user_id)
	VALUES (1, "2025-05-26", "10:00", "11:00", 1, 1);
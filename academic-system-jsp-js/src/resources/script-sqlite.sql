CREATE TABLE IF NOT EXISTS `roles` (
	`id_rol` INTEGER PRIMARY KEY AUTOINCREMENT,
	`role_name` TEXT NOT NULL
);

INSERT INTO `roles` (role_name) VALUES ('admin'), ('student'), ('teacher');

CREATE TABLE IF NOT EXISTS `users` (
	`id_user` INTEGER PRIMARY KEY AUTOINCREMENT,
	`name` TEXT NOT NULL,
	`lastname` TEXT NOT NULL,
	`document_number` TEXT NOT NULL UNIQUE,
	`password` TEXT NOT NULL,
	`role_id` INTEGER DEFAULT 1,
	FOREIGN KEY(role_id) REFERENCES roles(id_rol)
); 

CREATE TABLE IF NOT EXISTS `students` (
	`id_student` INTEGER PRIMARY KEY AUTOINCREMENT,
	`name` TEXT NOT NULL,
	`lastname` TEXT NOT NULL,
	`document_number` TEXT NOT NULL UNIQUE,
	`password` TEXT NOT NULL,
	`role_id` INTEGER DEFAULT 2,
	FOREIGN KEY(role_id) REFERENCES roles(id_rol)
);



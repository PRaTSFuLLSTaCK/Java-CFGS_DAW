SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS re_asignatura_alumno;
DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS asignatura;




/* Create Tables */

CREATE TABLE alumnos
(
	id int NOT NULL,
	nombre varchar(25) NOT NULL,
	apellidos varchar(25) NOT NULL,
	fecha_nacimiento date NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE asignatura
(
	id int NOT NULL,
	nombre varchar(25) NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE re_asignatura_alumno
(
	id_asig int NOT NULL,
	id_alum int NOT NULL,
	observaciones text
);



/* Create Foreign Keys */

ALTER TABLE re_asignatura_alumno
	ADD FOREIGN KEY (id_alum)
	REFERENCES alumnos (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE re_asignatura_alumno
	ADD FOREIGN KEY (id_asig)
	REFERENCES asignatura (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;




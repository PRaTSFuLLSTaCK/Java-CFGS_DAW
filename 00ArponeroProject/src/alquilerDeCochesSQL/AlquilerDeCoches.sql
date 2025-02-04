SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS alquiler;
DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS coche;




/* Create Tables */

CREATE TABLE alquiler
(
	fecha_inicio date NOT NULL,
	fecha_de_fin date NOT NULL,
	mat int NOT NULL,
	id int NOT NULL,
	PRIMARY KEY (fecha_inicio),
	UNIQUE (mat),
	UNIQUE (id)
);


CREATE TABLE clientes
(
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(25) NOT NULL,
	apellido varchar(25) NOT NULL,
	mail varchar(150) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
);


CREATE TABLE coche
(
	mat int NOT NULL,
	modelo varchar(25) NOT NULL,
	marca varchar(25) NOT NULL,
	fecha date NOT NULL,
	color varchar(25),
	PRIMARY KEY (mat),
	UNIQUE (mat)
);



/* Create Foreign Keys */

ALTER TABLE alquiler
	ADD FOREIGN KEY (id)
	REFERENCES clientes (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE alquiler
	ADD FOREIGN KEY (mat)
	REFERENCES coche (mat)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;




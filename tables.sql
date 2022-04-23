-- noinspection SqlDialectInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

-- H2 pruebas

-- Aqui iran todos los scripts SQL que se ejecuten, la idea
-- es que las pruebas se realicen en este archivo.


-- Por ahora la base de datos suministrada es la del parcial.

-- Cambios innecesarios xD

--Table TIPORECURSO
CREATE TABLE TIPORECURSO (
	tipo VARCHAR(17) NOT NULL,
	descripcion varchar(200) NOT NULL,
	horaMinima time not null,
	horaMaxima time not null
);

ALTER TABLE TIPORECURSO ADD PRIMARY KEY (tipo);

--DROP table tiporecurso;


--TABLE RECURSOS
CREATE TABLE RECURSOS (
	codigo CHAR(5) NOT NULL,
	tipo VARCHAR(17) NOT NULL,
	nombre VARCHAR(20) not NULL,
	enUso BOOLEAN not null,
	CONSTRAINT FK_recursos_tipoR FOREIGN KEY(tipo) REFERENCES TIPORECURSO(tipo)
);

CREATE TABLE Usuario (
	id VARCHAR(3) NOT NULL,
	nId VARCHAR(11) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	nombres VARCHAR(50) NOT NULL,
	programa VARCHAR(50) NOT NULL
);

--ALTER TABLE TIPORECURSO ADD PRIMARY KEY (id, nId);

--La siguiente instruccion recoge el primer dato de la tabla
--usuarios

SELECT * FROM usuario LIMIT 1;

--insert into usuario (id, nid, apellidos, nombres, programa) values ('1', 'Usuario1','Carrillo','yesid','sistemas')
--insert into usuario (id, nid, apellidos, nombres, programa) values ('1', 'Usuario2','Henao','Ronaldo','sistemas')
--insert into usuario (id, nid, apellidos, nombres, programa) values ('1', 'Usuario3','Lozano','Edwar','sistemas')
--insert into usuario (id, nid, apellidos, nombres, programa) values ('1', 'Usuario4','Fetecua','Santiago','sistemas')

--insert into recurso (codigo, tipo, nombre, enuso) values ('1', 'equipo didactico', 'libro', true)
--insert into recurso (codigo, tipo, nombre, enuso) values ('2', 'equipo computo', 'portatil', true )
--insert into recurso (codigo, tipo, nombre, enuso) values ('3', 'sala de estudio', 'sala 1', false)
--insert into recurso (codigo, tipo, nombre, enuso) values ('4', 'equipo didactico', 'libro', false)

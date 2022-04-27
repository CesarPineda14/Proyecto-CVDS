-- noinspection SqlDialectInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile

-- H2 pruebas

-- Aqui iran todos los scripts SQL que se ejecuten, la idea
-- es que las pruebas se realicen en este archivo.


-- Por ahora la base de datos suministrada es la del parcial.

-- Cambios innecesarios xD

--Tipo Recurso
CREATE TABLE TIPORECURSO (
	tipo VARCHAR(17) NOT NULL,
	descripcion varchar(200) NOT NULL,
	horaMinima time not null,
	horaMaxima time not null
);

ALTER TABLE TIPORECURSO ADD PRIMARY KEY (tipo);

--Ubicaciones
CREATE TABLE UBICACIONES (
	ubicacion VARCHAR(30) NOT NULL,
	horaMinima time not null,
	horaMaxima time not null
);

ALTER table UBICACIONES ADD PRIMARY KEY (ubicacion);

--Recursos
CREATE TABLE RECURSOS (
	codigo CHAR(5) NOT NULL,
	tipo VARCHAR(17) NOT NULL,
	ubicacion VARCHAR(30) not null,
	nombre VARCHAR(20) not NULL,
	CONSTRAINT FK_recursos_tipoR FOREIGN KEY(tipo) REFERENCES TIPORECURSO(tipo),
	CONSTRAINT FK_recursos_ubi FOREIGN KEY(ubicacion) REFERENCES UBICACIONES(ubicacion),
	UNIQUE(nombre)
);

ALTER table RECURSOS ADD PRIMARY KEY (codigo);

--Reservas
CREATE TABLE RESERVAS (
	codigo CHAR(5) NOT NULL,
	recurso VARCHAR(20) not null,
	horaInicial time not null,
	horaFinal time not null,
	periodicidad VARCHAR(17) NOT NULL,
	fechaFinal date not NULL,
	CONSTRAINT FK_reserva_recurso FOREIGN KEY(recurso) REFERENCES RECURSOS(nombre)
);

ALTER table RESERVAS ADD PRIMARY KEY (codigo);


DROP table reservas;
DROP table recursos;
DROP table tiporecurso;
DROP table UBICACIONES;

--Table Usuario
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

--Población

--insert into tiporecurso values ('Sala de estudio', 'Se usa para realizar trabajos intelectuales, leer o trabajar individualmente o en grupo', '9:00:00', '17:00:00');
--insert into tiporecurso values ('Equipo de computo', 'Dispositivo electrónico que le permite al usuario conectarse a distintas herramientas', '7:00:00', '18:30:00');
--insert into tiporecurso values ('Equipo multimedia', 'Herramienta o objeto útiles para el desarrollo de actividades académicas', '7:00:00', '18:30:00');

--delete from tiporecurso;

--insert into ubicaciones values ('Biblioteca Principal', '7:00:00', '19:00:00');
--insert into ubicaciones values ('Biblioteca Satelite', '9:00:00', '19:00:00');
--insert into ubicaciones values ('Edificio I', '9:00:00', '19:00:00');

--delete from ubicaciones;

--insert into recursos values ('00001', 'Sala de estudio', 'Biblioteca Principal', 'Sala Estudio 1', 'Activo');
--insert into recursos values ('00002', 'Equipo de computo', 'Biblioteca Satelite', 'PC Portatil 1', 'Inactivo');
--delete from recuros;

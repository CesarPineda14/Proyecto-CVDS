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
	maxTiempo INT NOT NULL
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
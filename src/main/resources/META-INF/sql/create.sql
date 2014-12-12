CREATE TABLE departamento(codigo VARCHAR (3) primary key, nombre VARCHAR (20) not NULL , latitud NUMERIC(10,7), longitud NUMERIC(10,7));
CREATE TABLE municipio(codigo VARCHAR (6) primary key, nombre VARCHAR (50) not NULL , departamento VARCHAR(3) NOT NULL , latitud NUMERIC(10,7), longitud NUMERIC(10,7));

ALTER TABLE municipio ADD CONSTRAINT fk_municipio_departamento FOREIGN KEY (departamento) REFERENCES departamento(codigo);

DROP DATABASE if exists ventas;

CREATE DATABASE ventas;

Use ventas;

CREATE TABLE Cliente(
nif CHAR(9) PRIMARY KEY, 
nombre VARCHAR(50),
direccion VARCHAR(50),
telefono INT
);

CREATE TABLE ModeloDormitorio(
cod VARCHAR(50) PRIMARY KEY
);

CREATE TABLE Montador(
nif CHAR(9) PRIMARY KEY,
nombre VARCHAR(50),
direccion VARCHAR(50),
telefono int
);


CREATE TABLE compra(
nif_c CHAR(9),
modelo VARCHAR(50),
fecha_compra DATE,
PRIMARY KEY (nif_c,modelo,fecha_compra),
FOREIGN KEY (nif_c) references Cliente(nif),
FOREIGN KEY (modelo) references ModeloDormitorio(cod)
);

CREATE TABLE monta(
modelo VARCHAR(50),
nif_m CHAR(9),
fecha_montaje DATE,
PRIMARY KEY (modelo,nif_m,fecha_montaje),
FOREIGN KEY (nif_m) references Montador(nif),
FOREIGN KEY (modelo) references ModeloDormitorio(cod)

);



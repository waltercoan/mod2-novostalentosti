CREATE DATABASE dbsistema;
USE dbsistema;

CREATE TABLE cliente (
	id int NOT NULL auto_increment,
	nome VARCHAR(200),
	cpf VARCHAR(25),
	datanascimento DATE,
	PRIMARY KEY(id)
);

INSERT INTO cliente(nome, cpf, datanascimento)
VALUES ('Huguinho','555.555.555-55','2022-06-30');
INSERT INTO cliente(nome, cpf, datanascimento)
VALUES ('Luizinho','333.333.333-33','2022-06-29');

SELECT * FROM cliente
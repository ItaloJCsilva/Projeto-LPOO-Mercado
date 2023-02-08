DROP DATABASE tst;
CREATE DATABASE tst;
use tst;
CREATE TABLE Gerente (
    nome varchar(25) ,
    idade int(3) ,
    email varchar(25) ,
    fone varchar(12) ,
	sexo varchar(1) ,
    cpf varchar(14) ,
    cargo varchar(20) ,
    senha varchar(8) 
    );
CREATE TABLE Caixa (
    nome varchar(25) ,
    idade int(3) ,
    email varchar(25) ,
    fone varchar(12) ,
	sexo varchar(1) ,
    cpf varchar(14) ,
    cargo varchar(20) ,
    senha varchar(8) 
    );

INSERT INTO Gerente (nome, senha)
VALUES ('Admin', '1');
INSERT INTO Caixa (nome, senha)
VALUES ('Caixa', '2');

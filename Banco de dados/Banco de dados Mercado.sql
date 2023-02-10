DROP DATABASE tst;
CREATE DATABASE tst;
use tst;
CREATE TABLE Gerente (
	id int(3) not null,
    nome varchar(25) not null ,
    salario decimal (6,2) not null,
    sexo varchar(1) not null ,
    cargo varchar(20) not null ,
    senha varchar(8)  not null
    );
CREATE TABLE Caixa (
	id int(3) not null,
    nome varchar(25) not null ,
    salario decimal (6,2) not null,
    sexo varchar(1) not null ,
    cargo varchar(20) not null ,
    senha varchar(8) not null 
    );
CREATE TABLE produtos (
	id int(3) not null,
    nome varchar(25) not null ,
    qtd int(3) not null ,
    preco decimal (6,2) not null 
    
    );

INSERT INTO Gerente (id,nome, salario,sexo,cargo,senha)
VALUES ('1','Italo', '2000.00','m','gerente','1');
INSERT INTO Caixa (id,nome, salario,sexo,cargo,senha)
VALUES ('1','Maria', '1200.00','f','caixa','2');
select * from gerente;
select * from Caixa;

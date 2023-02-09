DROP DATABASE tst;
CREATE DATABASE tst;
use tst;
CREATE TABLE Gerente (
    nome varchar(25) not null ,
    salario decimal (6,2) not null,
    sexo varchar(1) not null ,
    cpf varchar(14) not null ,
    cargo varchar(20) not null ,
    senha varchar(8)  not null
    );
CREATE TABLE Caixa (
    nome varchar(25) not null ,
    salario decimal (6,2) not null,
    sexo varchar(1) not null ,
    cpf varchar(14) not null,
    cargo varchar(20) not null ,
    senha varchar(8) not null 
    );

INSERT INTO Gerente (nome, salario,sexo,cpf,cargo,senha)
VALUES ('Italo', '2000.00','m','15','gerente','1');
INSERT INTOnomesalario Caixa (nome, salario,sexo,cpf,cargo,senha)
VALUES ('Maria', '1200.00','f','11','caixa','22');
select * from Gerente;
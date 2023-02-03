DROP DATABASE tst;
CREATE DATABASE tst;
use tst;
CREATE TABLE Funcionario (
    nome varchar(25) ,
    idade int(3) ,
    email varchar(25) ,
    fone varchar(12) ,
	sexo varchar(1) ,
    cpf varchar(14) ,
    cargo varchar(20) ,
    senha varchar(8) 
    );
create table Produto(
nome varchar(45) ,
valor decimal(6,2) ,
qtd varchar(25) 
);
create table OrdemDeServico(
DTemissao date  ,
valorTotal decimal (6,2) 
);



INSERT INTO Funcionario (nome, senha)
VALUES ('Admin', '1');

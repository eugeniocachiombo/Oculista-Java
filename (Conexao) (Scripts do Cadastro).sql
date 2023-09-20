use oculista;

select * from cadastro;

create table cadastro(
id int primary key auto_increment not null,
Nome varchar (50) not null,
BI varchar(20) not null,
Dia int not null,
Mes varchar(5) not null,
Ano int not null,
Sexo varchar(10) not null,
Categoria varchar (30) not null,
Telefone int not null,
Morada varchar (30) not null
);

select * from compra;

create table Compra(

cod_Prod int primary key auto_increment not null ,
tipo varchar(30)  null,
preço int  null,
Qd int null
);

drop table compra;


select * from marcação;

create table Marcação(
Cod_consulta int primary key auto_increment not null,
nome varchar (30) not null,
hora varchar(10) not null,
dia int not null,
mes varchar (10) not null,
ano int not null,
telefone int not null,
tipo_consulta varchar (30) not null
);


select * from usuario;

create table usuario (
id int primary key auto_increment not null,
Nome varchar (50) not null,
Telefone int not null,
idcadastro int not null
);

ALTER TABLE `usuario` ADD CONSTRAINT `fk_cadastro` FOREIGN KEY (`idcadastro`) REFERENCES `cadastro`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
create database db_projeto;
use db_projeto;

create table tb_cliente (
	idcliente int auto_increment not null primary key,
    descnome varchar(255) not null,
    desccpf varchar(255) not null,
    descemail varchar(255) not null
);

create table tb_carro (
	idcarro int auto_increment not null primary key,
    descmarca varchar(255) not null,
    descmodelo varchar(255) not null, 
    desccor varchar(255) not null,
    descnovo enum('sim', 'nao') not null,
    descusado enum('sim', 'nao') not null,
    proprietario int not null
);

alter table tb_carro add foreign key (proprietario) references tb_cliente (idcliente);

create table tb_estoque (
	idestoque int auto_increment not null primary key,
	descmarca varchar(255) not null,
    descmodelo varchar(255) not null, 
    desccor varchar(255) not null,
    descnovo enum('sim', 'nao') not null,
    descusado enum('sim', 'nao') not null
);

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

create table tb_funcionario (
	idfuncionario int auto_increment not null primary key,
    descnome varchar(255),
    descsobrenome varchar(255),
    descfuncao varchar(255),
    desccpf varchar(255),
    descemail varchar(255)
);

create table tb_concessionaria(
	idconcessionaria int auto_increment not null primary key,
    descnome varchar(255),
    desccnpj varchar(255),
    descemail varchar(255),
    funcionario int not null
);

alter table tb_concessionaria add foreign key (funcionario) references tb_funcionario (idfuncionario);

create table tb_acesso_sistema (
	idacesso int auto_increment not null primary key,
    descnome varchar(255) not null,
    descemail varchar(255) not null,
    descsenha varchar(255) not null
);

insert into tb_acesso_sistema (descnome, descemail, descsenha) values ('admin', 'admin@admin', '123');

delete from tb_cliente;
delete from tb_carro;
delete from tb_estoque;
delete from tb_concessionaria;
delete from tb_funcionario;

select * from tb_cliente;
select * from tb_carro;
select * from tb_estoque;
select * from tb_concessionaria;
select * from tb_funcionario;

alter table tb_cliente auto_increment = 0;
alter table tb_carro auto_increment = 0;
alter table tb_estoque auto_increment = 0;
alter table tb_concessionaria auto_increment = 0;
alter table tb_funcionario auto_increment = 0;

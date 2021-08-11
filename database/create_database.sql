-- Criando um novo database para o curso Java
create database itau;
-- Acessando a base criada
use itau;
-- Criando tabelas na base itau
create table itau.clientes (
	codigo_cliente	integer not null primary key,
    nome_cliente	varchar (50) not null,
    idade_cliente	integer not null,
    email_cliente	varchar (80) not null
);
-- Verificando estrutura de tabelas
describe itau.clientes;

-- Inserindo registros nas tabelas criadas
insert into itau.clientes (
	codigo_cliente,
	nome_cliente,
	idade_cliente,
	email_cliente
)
values
	(1,"Daniel Leomil",40,"dleomil@gmail.com"),
    (2,"Eduardo Ribeiro",22,"eduardo@ribeiro.com.br"),
	(3,"Carolna Nunes",19,"carolina@itau-inibnco.com.br"),
	(4,"Willian Soares",25,"willian@itau-unibanco.com.br");

-- Verificando os dados inseridos na tabela
select * from itau.clientes;
select nome_cliente, idade_cliente from itau.clientes;
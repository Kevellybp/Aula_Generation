create database db_escola;
use db_escola;
create table tb_serie(
id bigint auto_increment,
serie int (4),create database db_escola;
use db_escola;
create table tb_serie(
id bigint auto_increment,
serie int (4),
primary key (id)
); 

use db_escola;
create table tb_alunos (
id bigint auto_increment,
nome varchar (20),
id_serie bigint (10),
periodo varchar (13), 
nota decimal (10,2),
primary key (id),
foreign key (id_serie) references tb_serie (id)
);

insert into tb_serie (serie) value (1);
insert into tb_serie (serie) value (2);
insert into tb_serie (serie) value (3);
insert into tb_serie (serie) value (4);
insert into tb_serie (serie) value (5);
insert into tb_serie (serie) value (6);
insert into tb_serie (serie) value (7);
insert into tb_serie (serie) value (8);
insert into tb_serie (serie) value (9);

insert into tb_alunos (nome, id_serie, periodo,nota) values ("Roberto", 2,"vespertino", 7.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Carol", 9, "matutino", 6.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Carla", 6, "matutino", 9.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Sther", 2, "vespertino", 10.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Igor", 3, "matutino", 8.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Rafa", 1, "matutino", 4.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Rodrigo", 8, "vespertino", 7.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Lua", 9, "vespertino", 7.5);

select * from tb_alunos where nota>=7;
select * from tb_alunos where nota<=7;
select * from tb_alunos where nota<>7
primary key (id)
); 

use db_escola;
create table tb_alunos (
id bigint auto_increment,
nome varchar (20),
id_serie bigint (10),
periodo varchar (13), 
nota decimal (10,2),
primary key (id),
foreign key (id_serie) references tb_serie (id)
);

insert into tb_serie (serie) value (1);
insert into tb_serie (serie) value (2);
insert into tb_serie (serie) value (3);
insert into tb_serie (serie) value (4);
insert into tb_serie (serie) value (5);
insert into tb_serie (serie) value (6);
insert into tb_serie (serie) value (7);
insert into tb_serie (serie) value (8);
insert into tb_serie (serie) value (9);

insert into tb_alunos (nome, id_serie, periodo,nota) values ("Roberto", 2,"vespertino", 7.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Carol", 9, "matutino", 6.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Carla", 6, "matutino", 9.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Sther", 2, "vespertino", 10.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Igor", 3, "matutino", 8.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Rafa", 1, "matutino", 4.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Rodrigo", 8, "vespertino", 7.0);
insert into tb_alunos (nome,id_serie,periodo,nota ) values ("Lua", 9, "vespertino", 7.5);

select * from tb_alunos where nota>=7;
select * from tb_alunos where nota<=7;
select * from tb_alunos where nota<>7
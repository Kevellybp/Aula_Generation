create database db_ecommerce;
use db_ecommerce;
create table tb_marcas (
id bigint auto_increment,
marca varchar (20),
primary key (id) 
);

use db_ecommerce;
create table tb_produtos (
id bigint auto_increment,
nome varchar (10) not null,
marca_id bigint (20) not null,
preco decimal (10,2) not null,
tipo varchar (14) not null,
primary key (id),
foreign key (marca_id) references tb_marcas (id)
);

insert into tb_marcas (marca) value ("Amazon");
insert into tb_marcas (marca) value ("Otto");
insert into tb_marcas (marca) value ("eBay");
insert  into tb_marcas (marca) value ("JD");

insert into tb_produtos (nome,marca_id,preco,tipo) values ("Celular", 1, 3000, "Samsung");
insert into tb_produtos (nome,marca_id,preco, tipo) values ("Notbook", 2, 5000, "Dell");
insert into tb_produtos (nome, marca_id, preco, tipo) values ("Carro", 3, 30000, "Ford");
insert into tb_produtos (nome, marca_id, preco,tipo) values ("Roupa", 4, 150.00, "Vestido");
insert into tb_produtos (nome,marca_id,preco,tipo) values ("Livro",1, 50.00, "Literatura");
insert into tb_produtos (nome, marca_id, preco,tipo) values ("Jogo", 1, 200.00, "PS4");
insert into tb_produtos (nome,marca_id, preco, tipo) values ("Pneu", 1, 400.00, "Aro 13");
insert into tb_produtos (nome, marca_id, preco, tipo) values ("Video-Game", 2, 1000,"X-box");

select * from tb_produtos where preco<=;
select * from tb_produtos where preco<>500;
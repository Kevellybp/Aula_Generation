use db_empresa
	create table tb_funcionario ( 
    id bigint auto_increment,
    cpf bigint (11) not null,
    nome varchar (20) not null,
    idade int (100) not null,
    cargo varchar (20) not null, 
    salaro decimal (10,2), primary key(id) )	

	insert into tb_funcionario (cpf, nome, idade, cargo, salaro) values (212121212, "Clara", 25, "Professora", 2000);
insert into tb_funcionario (cpf, nome, idade,cargo,salaro) values (111111111,"Diego", 30, "Diretor", 1000);
insert into tb_funcionario (cpf, nome, idade, cargo, salaro) values (22222222,"Roberto", 18, "Estagiário", 1000);
insert into tb_funcionario (cpf, nome, idade, cargo,salaro) values (333333333,"Fernanda",29, "Dev junior", 4000)
insert into tb_funcionario (cpf, nome, idade, cargo,salaro) values (444444444,"Caio",28, "SG", 1500);


    

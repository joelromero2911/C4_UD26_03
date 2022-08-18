DROP table IF EXISTS ventas;
DROP table IF EXISTS cajeros;
DROP table IF EXISTS productos;
DROP table IF EXISTS maquinas_registradoras;

create table cajeros(
    codigo int auto_increment,
    nom_apels varchar(255),
	primary key (codigo)
);

create table productos(
    codigo int auto_increment,
    nombre varchar(100),
    precio int,
    primary key (codigo)
);

create table maquinas_registradoras(
    codigo int auto_increment,
	piso int,
	primary key (codigo)
);

create table ventas(
    id int auto_increment,
    cajero int,
    maquina int,
    producto int,
    primary key (id),
    constraint ventas_a_fk foreign key (cajero) references cajeros(codigo),
    constraint ventas_a_fk_01 foreign key (maquina) references maquinas_registradoras(codigo),
    constraint ventas_a_fk_02 foreign key (producto) references productos(codigo)
);

insert into cajeros (nom_apels)values('Alguien Importante');
insert into cajeros (nom_apels)values('Joel Romero');
insert into cajeros (nom_apels)values('Izan Dueso');

insert into productos (nombre, precio)values('patatas', 3);
insert into productos (nombre, precio)values('peras', 2);
insert into productos (nombre, precio)values('manzanas', 2);

insert into maquinas_registradoras (piso)values(1);
insert into maquinas_registradoras (piso)values(2);
insert into maquinas_registradoras (piso)values(2);

insert into ventas (cajero, maquina, producto)values(1, 1, 1);
insert into ventas (cajero, maquina, producto)values(11, 11, 11);
insert into ventas (cajero, maquina, producto)values(21, 21, 21);
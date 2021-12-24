create database juego;

use juego;

create table jugador(
    id int(10) not null,
    nombre varchar(100) not null,
    puntaje int(10) not null,
    dineroganado int(10) not null,
    primary key(id)
);

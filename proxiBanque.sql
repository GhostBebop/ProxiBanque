-- 
-- Création de la table Client
-- 

create table if not exists clients(
id int auto_increment primary key,
nom varchar(32) not null,
prenom varchar(255),
age int,
adresse varchar(255) not null,
telephone int (20) not null,
typeClient varchar(32) not null,
)ENGINE = InnoDB;

-- 
-- Création de la table Agence
-- 

create table if not exists agences(
id int auto_increment primary key,
nom varchar(32) not null,
adresse varchar(255) not null
)ENGINE=InnoDB;

-- 
-- Creation de la table Compte
-- 

create table if not exists comptes(
id int auto_increment primary key,

)ENGINE=InnoDB;
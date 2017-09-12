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
-- Création de la table Compte
-- 

create table if not exists comptes(
id int auto_increment primary key,
code int not null,
solde int,
dateCreation date not null,
typeCompte varchar(32) not null,
decouvert int,
taux float
)ENGINE=InnoDB;

-- 
-- Création de la table Employé
-- 

create table if not exists employes(
id int auto_increment primary key,
nom varchar(32) not null,
prenom varchar(32) not null,
tel int(25) not null,
adresse varchar(255) not null,
email varchar(255),
login varchar(32) not null,
mdp varchar(32) not null,
typeEmploye varchar(32)
)ENGINE=InnoDB;

-- 
-- Création de la table Carte 
-- 

create table if not exists carte(
id int auto_increment primary key,
typeCarte varchar(32) not null
)ENGINE=InnoDB;
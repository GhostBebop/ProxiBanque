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
email varchar(32)
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
dateCreation varchar(32) not null,
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


-- 
-- Ajouter une contrainte AGENCE EMPLOYES
-- 

alter table employes
add idAgence int null;

alter table employes
add constraint fk_agence_employe foreign key (idAgence) references employes(id);

-- 
-- Ajouter une ocntrainte Gérant/Conseiller
-- 

alter table employes
add idGerant int null;

alter table employes
add constraint fk_conseiller_gerant foreign key (idGerant) references employes(id);

-- 
-- Ajouter une contrainte Conseiller Client
-- 

alter table clients
add idConseiller;

alter table clients
add constraint fk_conseiller_client foreign key (idConseiller) references employes(id);

-- 
-- Ajouter uen contrainte Client Compte
-- 

alter table comptes
add idClient;

alter table comptes
add constraint fk_client_compte foreign key (idClient) references comptes(id);

-- 
-- Ajouter une contrainte Compte Carte
-- 

alter table carte
add idCompte int not null;

alter table carte
add constraint fk_compte_carte foreign key (idCompte) references comptes(id);
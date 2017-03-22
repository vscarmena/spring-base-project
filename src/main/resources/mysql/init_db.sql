CREATE TABLE IF NOT EXISTS authorities (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	authority_name varchar(50) NOT NULL
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS users (
  	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	username varchar(50) NOT NULL,
  	password varchar(50) NOT NULL,
    securityCode varchar(50) DEFAULT NULL,
  	enabled tinyint(1) NOT NULL
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS user_authorities (
  	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	user_id int(11) NOT NULL,
  	authority_id int(11) NOT NULL,
  	KEY fk_user (user_id),
  	KEY fk_authority (authority_id),
  	CONSTRAINT fk_authority FOREIGN KEY (authority_id) REFERENCES authorities (id),
  	CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id)
) engine=InnoDB;

CREATE TABLE user_data (
id int(11) primary key,
KEY fk_user_data (id),
  	CONSTRAINT fk_user_data FOREIGN KEY (id) REFERENCES users (id),
 email varchar (30) NOT NULL,
name varchar(30) NOT NULL DEFAULT '',
surname varchar(30) NOT NULL DEFAULT '',
genre int(1) NOT NULL DEFAULT '0',
birthDate date,
idTelephone int(2) NOT NULL DEFAULT '0',
telephone varchar(15) NOT NULL DEFAULT'',
address varchar (30) NOT NULL DEFAULT '',
country varchar (25) NOT NULL DEFAULT '',
CP varchar (10) NOT NULL DEFAULT '',
city varchar (25) NOT NULL DEFAULT '',
nif varchar (10) NOT NULL DEFAULT '',
namef varchar(30) NOT NULL DEFAULT '',
surnamef varchar(30) NOT NULL DEFAULT '',
idTelephonef int(2) NOT NULL DEFAULT '0',
telephonef varchar(15) NOT NULL DEFAULT'',
addressf varchar (30) NOT NULL DEFAULT '',
countryf varchar (25) NOT NULL DEFAULT '',
CPf varchar (10) NOT NULL DEFAULT '',
cityf varchar (25) NOT NULL DEFAULT ''
  	
) engine=InnoDB;

CREATE TABLE campings (
id int(11) primary key auto_increment,
owner int(11),
KEY fk_camping_idowner (owner),
  	CONSTRAINT fk_camping_idowner FOREIGN KEY (owner) REFERENCES users (id),
name varchar(30) NOT NULL DEFAULT '',
idTelephone int(2) NOT NULL DEFAULT '0',
telephone varchar(15) NOT NULL DEFAULT'',
address varchar (30) NOT NULL DEFAULT '',
country varchar (25) NOT NULL DEFAULT '',
CP varchar (10) NOT NULL DEFAULT '',
city varchar (25) NOT NULL DEFAULT '',
cif varchar (10) NOT NULL DEFAULT '',
namef varchar(30) NOT NULL DEFAULT '',
idTelephonef int(2) NOT NULL DEFAULT '0',
telephonef varchar(15) NOT NULL DEFAULT'',
addressf varchar (30) NOT NULL DEFAULT '',
countryf varchar (25) NOT NULL DEFAULT '',
CPf varchar (10) NOT NULL DEFAULT '',
cityf varchar (25) NOT NULL DEFAULT '',
description varchar(1000) NOT NULL DEFAULT '',
ubicacion varchar (250) NOT NULL DEFAULT ''
  	
) engine=InnoDB;


INSERT INTO authorities (authority_name) VALUES ('ROLE_ADMIN');
INSERT INTO authorities (authority_name) VALUES ('ROLE_USER');
INSERT INTO users (username, password, enabled) VALUES ('xavi', 'shurmano', 1);
INSERT INTO users (username, password, enabled) VALUES ('cesare', 'augusto', 1);
INSERT INTO users (username, password, enabled) VALUES ('victor', 'condemor', 1);
INSERT INTO users (username, password, enabled) VALUES ('beatrix', 'lestrange', 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (2, 2);
INSERT INTO user_authorities (user_id, authority_id) VALUES (3, 2);
INSERT INTO user_authorities (user_id, authority_id) VALUES (4, 2);
INSERT INTO `caravaning`.`user_data` (`id`,`email`, `name`, `surname`, `genre`, `birthDate`, `idTelephone`, `telephone`, `address`, `country`, `CP`) 
VALUES (1,'silentxavi@yahoo.es', 'Xavier', 'shurmano', '1', '1999-02-09', '34', '123412345', 'a/Del Disseny', 'Korea', '12345'),
(2,'cesarAsturianu@gmail.com', 'Cesare', 'Augusto', '1', '1912-09-17', '34', '654321789', 'c/de la Sidra', 'Russiano', '09876'),
(3,'victor_tgn_69@hotmail.com', 'Victor', 'Condemor Praderar', '1', '1992-09-25', '33', '654123989', 'c/de los Sueños 14 7oC', 'Vietnam', '08081'),
(4,'sevillana_69@yahoo.es', 'Beatrix', 'Lestrange', '0', '1990-08-16', '45', '666777885', 'a/De la Grasia n89 6o2a', 'Andalucia', '98798');
INSERT INTO `caravaning`.`campings` (`owner`, `name`, `idTelephone`, `telephone`, `address`, `country`, `CP`, `city`)
VALUES ('1', 'CAMPING PAQUITO', '34', '23456789', 'a/Paquito\'s road', 'Irak', '67832', 'Bagdad'),
('2', 'CAMPING PEPITO', '34', '2342345', 'a/Pepito\'s road', 'Vietnam', '23332', 'Hanoi'),
('3', 'CAMPING CARLITOS', '34', '23454576', 'a/Carlito\'s road', 'Russia', '98765', 'Vladivostok'),
('4', 'CAMPING MARIA', '34', '234986', 'a/Maria\'s road', 'Madagascar', '67999', 'Antananarivo');
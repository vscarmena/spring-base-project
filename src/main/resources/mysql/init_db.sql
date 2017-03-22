CREATE TABLE IF NOT EXISTS authorities (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	authority_name varchar(50) NOT NULL
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS users (
  	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	username varchar(50) NOT NULL,
  	password varchar(50) NOT NULL,
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
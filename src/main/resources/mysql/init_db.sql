CREATE TABLE IF NOT EXISTS items (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	name varchar(50) NOT NULL DEFAULT '',
  	field1 varchar(50) DEFAULT NULL,
  	field2 varchar(50) DEFAULT NULL
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS authorities (
	id int(11) NOT NULL PRIMARY KEY,
	authority_name varchar(50) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS users (
  	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	username varchar(50) NOT NULL,
  	password varchar(100) NOT NULL,
    securityCode varchar(50) DEFAULT NULL,
  	enabled tinyint(1) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS user_authorities (
  	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	user_id int(11) NOT NULL,
  	authority_id int(11) NOT NULL,
  	KEY fk_user (user_id),
  	KEY fk_authority (authority_id),
  	CONSTRAINT fk_authority FOREIGN KEY (authority_id) REFERENCES authorities (id),
  	CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS user_data (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	user_id int(11) NOT NULL,
	email varchar (30),
	name varchar(30) NOT NULL,
	surname varchar(30) NOT NULL,
    nif varchar (10) NOT NULL DEFAULT '',
	genre varchar(1),
	birthDate date,
	idTelephone int(3),
	telephone varchar(15),
	address varchar (30),
	country varchar (25),
	CP varchar (10),
	city varchar (25),
	rating float (2),
	rates int (8),
  	KEY fk_user_data (user_id),
  	CONSTRAINT fk_user_data FOREIGN KEY (user_id) REFERENCES users (id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS user_facturation_data (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id int(11) NOT NULL,
	niff varchar (10) NOT NULL DEFAULT '',
	namef varchar(30) NOT NULL DEFAULT '',
	addressf varchar (30) NOT NULL DEFAULT '',
	emailf varchar (30) NOT NULL DEFAULT '',
    KEY fk_user_facturation_data (user_id),
  	CONSTRAINT fk_user_facturation_data FOREIGN KEY (user_id) REFERENCES users (id)
    ) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS UserConnection (
	userId varchar(255) not null,
    providerId varchar(255) not null,
    providerUserId varchar(255),
    rank int not null,
    displayName varchar(255),
    profileUrl varchar(512),
    imageUrl varchar(512),
    accessToken varchar(512) not null,
    secret varchar(512),
    refreshToken varchar(512),
    expireTime bigint,
    primary key (userId, providerId, providerUserId)
) ENGINE=InnoDB;
CREATE UNIQUE INDEX UserConnectionRank on UserConnection(userId, providerId, rank);

CREATE TABLE IF NOT EXISTS campings (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	owner int(11),
	name varchar(30) NOT NULL DEFAULT '',
	idTelephone int(3),
	telephone varchar(15),
	address varchar (30),
	country varchar (25),
	cp varchar (10),
	city varchar (25),
	rating float (2),
	rates int (8),
    schedule varchar (20),
	cif varchar (10) NOT NULL DEFAULT '',
	namef varchar(30) NOT NULL DEFAULT '',
	addressf varchar (30) NOT NULL DEFAULT '',
	emailf varchar (30) NOT NULL DEFAULT '',
	description text,
	ubication varchar (250) NOT NULL DEFAULT '',
	zone varchar (30),
  	CONSTRAINT fk_camping_idowner FOREIGN KEY (owner) REFERENCES users (id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS campings_services (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	camping_id int(11) NOT NULL,
	animation boolean ,
    pool boolean ,
    heated_pool boolean ,
    gym boolean ,
    wifi boolean ,
    supermarket boolean ,
    beach boolean ,
    disco boolean ,
    doctor boolean ,
    kindergarten boolean ,
    pub boolean ,
    minigolf boolean ,
    wellness boolean,
    atm boolean ,
    defibrillator boolean ,
    laundry boolean ,
    dogs boolean ,
    snack_bar boolean ,
    restaurant boolean ,
    tennis boolean ,
    paddel boolean ,
    football boolean ,
  	KEY fk_campings_service (camping_id),
  	CONSTRAINT fk_campings_service FOREIGN KEY (camping_id) REFERENCES campings (id)
) ENGINE=InnoDB;

INSERT INTO items (name, field1, field2) VALUES ('lorem', 'ipsum', 'dolor');
INSERT INTO items (name, field1, field2) VALUES ('consectetur', 'adipiscing', 'elit');
INSERT INTO items (name, field1, field2) VALUES ('Aenean', 'suscipit', 'fermentum');
INSERT INTO authorities (id, authority_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO authorities (id, authority_name) VALUES (2, 'ROLE_USER');
/* For crypt/decrypt passowrds check: https://bcrypt-generator.com */
INSERT INTO users (username, password, enabled) VALUES ('xavi', '$2a$10$PSSLc3GCqjX/2OK7Bn9LAO4eFDpDMuYeIU8Al4qb8kA5Gb2IF8eCW', 1);
INSERT INTO users (username, password, enabled) VALUES ('cesare', '$2a$10$BmQegr8CKNonv4kekqIK8.n0O9k8paDtm8JYZg48Z1P.qKkQ9Ch02', 1);
INSERT INTO users (username, password, enabled) VALUES ('victor', '$2a$10$9H6zMCLgHymTq7izksZjVuCn4VoUBonbqPvP7uIuLY9oGR/kXLQIC', 1);
INSERT INTO users (username, password, enabled) VALUES ('beatrix', '$2a$10$gzHtLdR9uTx1DesXt1mVheUM/7FaZdsXswpYkAxxrpkLMtPkVMxfO', 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (2, 2);
INSERT INTO user_authorities (user_id, authority_id) VALUES (3, 2);
INSERT INTO user_authorities (user_id, authority_id) VALUES (4, 2);
INSERT INTO user_data (user_id, email, name, surname, genre, birthDate, idTelephone, telephone, address, country, CP) 
VALUES (1,'silentxavi@yahoo.es', 'Xavier', 'shurmano', '1', '1999-02-09', '34', '123412345', 'a/Del Disseny', 'Korea', '12345'),
(2,'cesarAsturianu@gmail.com', 'Cesare', 'Augusto', '1', '1912-09-17', '34', '654321789', 'c/de la Sidra', 'Russiano', '09876'),
(3,'victor_tgn_69@hotmail.com', 'Victor', 'Condemor Praderar', '1', '1992-09-25', '33', '654123989', 'c/de los Sueños 14 7oC', 'Vietnam', '08081'),
(4,'sevillana_69@yahoo.es', 'Beatrix', 'Lestrange', '0', '1990-08-16', '45', '666777885', 'a/De la Grasia n89 6o2a', 'Andalucia', '98798');
INSERT INTO campings (owner, name, idTelephone, telephone, address, country, CP, city)
VALUES (1, 'CAMPING PAQUITO', '34', '23456789', 'a/Paquito\'s road', 'Irak', '67832', 'Bagdad'),
('2', 'CAMPING PEPITO', '34', '2342345', 'a/Pepito\'s road', 'Vietnam', '23332', 'Hanoi'),
('3', 'CAMPING CARLITOS', '34', '23454576', 'a/Carlito\'s road', 'Russia', '98765', 'Vladivostok'),
('4', 'CAMPING MARIA', '34', '234986', 'a/Maria\'s road', 'Madagascar', '67999', 'Antananarivo');
INSERT INTO `caravaning`.`user_facturation_data` (`id`, `user_id`, `niff`, `namef`, `addressf`, `emailf`) VALUES ('1', '1', '87665434K', 'Pepito', 'C/ Pollo', 'xavi_pollo@gmail.com');

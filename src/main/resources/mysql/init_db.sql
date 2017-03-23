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

CREATE TABLE IF NOT EXISTS user_data (
	id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  	user_id int(11) NOT NULL,
  	name varchar(50) NOT NULL,
  	lastname varchar(50) NOT NULL,
  	KEY fk_user_data (user_id),
  	CONSTRAINT fk_user_data FOREIGN KEY (user_id) REFERENCES users (id)
) engine=InnoDB;

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
) engine=InnoDB;
CREATE UNIQUE INDEX UserConnectionRank on UserConnection(userId, providerId, rank);


INSERT INTO authorities (authority_name) VALUES ('ROLE_ADMIN');
INSERT INTO authorities (authority_name) VALUES ('ROLE_USER');
INSERT INTO users (username, password, enabled) VALUES ('chuck', 'norris', 1);
INSERT INTO users (username, password, enabled) VALUES ('willy', 'fog', 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authorities (user_id, authority_id) VALUES (1, 2);
INSERT INTO user_authorities (user_id, authority_id) VALUES (2, 2);
INSERT INTO user_data (user_id, name, lastname) VALUES (1, 'Carlos', 'Ray Norris');
INSERT INTO user_data (user_id, name, lastname) VALUES (2, 'William', 'Fog');
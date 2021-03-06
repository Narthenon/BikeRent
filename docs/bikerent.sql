CREATE DATABASE IF NOT EXISTS tanar_bikerent;

USE tanar_bikerent;

CREATE TABLE IF NOT EXISTS brands (

	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	brand VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS brakes (
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	brake VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS designs(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	design VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS sizes(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	size VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS types(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	type VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS bikes(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	code CHAR(5),
	speed INTEGER,
	brand_id INTEGER,
	brake_id INTEGER,
	design_id INTEGER,
	size_id INTEGER,
	type_id INTEGER,
	FOREIGN KEY ( brand_id ) REFERENCES brands( id ),
	FOREIGN KEY ( brake_id ) REFERENCES brakes( id ),
	FOREIGN KEY ( design_id ) REFERENCES designs( id ),
	FOREIGN KEY ( size_id ) REFERENCES sizes( id ),
	FOREIGN KEY ( type_id ) REFERENCES types( id )
	
);

CREATE TABLE IF NOT EXISTS renters(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100),
	email VARCHAR(100),
	phone VARCHAR(20),
	address VARCHAR(255),
	identity VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS rents(
	
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	startdate DATE,
	enddate DATE,
	deposit INTEGER,
	renter_id INTEGER,
	bike_id INTEGER,
	FOREIGN KEY ( renter_id ) REFERENCES renters( id ),
	FOREIGN KEY ( bike_id ) REFERENCES bikes( id )
); 



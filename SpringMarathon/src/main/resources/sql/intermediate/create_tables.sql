DROP TABLE IF EXISTS baseball_teams;

CREATE TABLE baseball_teams
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
base VARCHAR(255),
start DATE,
history VARCHAR(255),
INDEX(id)
);

DROP TABLE IF EXISTS hotels;

CREATE TABLE hotels
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
nearest_station VARCHAR(255),
price INT,
INDEX(id)
);

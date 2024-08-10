create database telusko_db;
DROP DATABASE telusko_db;
CREATE SCHEMA telusko_db;
drop schema telusko_db;

create database if not exists telusko_db;

/**
Data Types:
INT - 44,4,78
FLOAT - 4.5,55.2
CHAR => fixed length string, Postal code
VARCHAR => variable length string, FirstName, CIty
DATE => 12/12/2024
TIME => 12:44
DATETIME => 12/12/2024 12:44:44
BOOLEAN => True/False
*/

use telusko_db;

create table personalInfo(
id INT,
name varchar(40),
date_of_birth date,
city varchar(40)
);

create table personalEducation(
id INT,
courses varchar(30),
city_of_education varchar(40)
);

insert into personalInfo(id, name, date_of_birth, city) values (1, 'Akash', '2000-07-22', 'Ganneruvaram');
insert into personalInfo(id, name, date_of_birth, city) values (2, 'Rohit', '2000-07-22', 'Ganneruvaram');
insert into personalInfo(id, name, date_of_birth, city) values (3, 'Ramesh', '2000-10-22', 'Hyderabad');

insert into personalInfo(id, name, date_of_birth, city) values (4, 'Raju', '1999-10-22', 'Banglore'),
(5, 'Kamal', '1998-10-22', 'Pune'),
(6, 'Uday', '1998-07-22', 'Mumbai');


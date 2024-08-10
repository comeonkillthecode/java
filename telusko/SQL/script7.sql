use telusko_db;
create table city(id int auto_increment, cityname varchar(20), primary key(id));
SELECT * FROM telusko_db.city;
insert into city(cityname) values ("Bangolre"), ("Pune"), ("Karimnagar"), ("Mumbai");


CREATE TABLE student(sid INT AUTO_INCREMENT, name VARCHAR(50), age INT, city INT, PRIMARY KEY(sid), FOREIGN KEY(city) references city(id));
SELECT * FROM telusko_db.student;
INSERT INTO student(name, age, city) values
( "Rohit " ,22, 1),
( " Robin " ,24,2),
( " Ramesh", 22,3),
( " Rahul " ,24,4);

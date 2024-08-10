use telusko_db;

create table studentsINfo(
id int not null,
name varchar(40) not null,
age int not null check(age>=18),
gender varchar(10) not null,
phone varchar(10) not null,
city varchar(20) not null default "Bangalore",
primary key (id));

INSERT INTO studentsInfo(id,name, age, gender, phone)
VALUES(1, " Rohan" , 19, "Male","456123");

INSERT INTO studentsInfo(id,name, age, phone)
VALUES(1, " Rohan" , 19,"456123");

INSERT INTO studentsInfo(id,name, age, gender, phone)
VALUES(2, "Rohan" , 19, "Male","456123");
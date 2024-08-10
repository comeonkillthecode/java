use telusko_db;

create table employee(
id int,
emp_name varchar(40),
emp_age int,
emp_city varchar(40),
primary key(id));


insert into employee(id, emp_name, emp_age, emp_city)
values
(1, "Rohan", 15, "Bangalore"),
(2, "Rohan", 15, "Bangalore"),
(3, "Rohan", 15, "Bangalore");

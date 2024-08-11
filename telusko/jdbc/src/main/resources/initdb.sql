create database if not exists jdbc_learning;

use jdbc_learning;

create table if not exists studentInfo(
id int not null,
sname varchar(40) not null,
sage int not null,
scity varchar(20) not null,
primary key(id)
)
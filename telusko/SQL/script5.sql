use telusko_db;

select * from employee;

update employee set emp_name="Rohit" where id =3;

update employee set emp_city="Pune" where id in(2,3);

delete from employee where id=3;
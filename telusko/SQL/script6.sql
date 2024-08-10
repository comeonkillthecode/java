use telusko_db;
select * from employee;
update employee set emp_age=36 where id=2;
rollback;
commit;
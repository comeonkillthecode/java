use sakila;

select * from category as c INNER join film_category as f on c.category_id = f.category_id;

select * from category as c left join film_category as f on c.category_id = f.category_id;

select * from category as c right join film_category as f on c.category_id = f.category_id;

select * from category as c join film_category as f on c.category_id = f.category_id;
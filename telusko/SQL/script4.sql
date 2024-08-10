# where caluse

use sakila;

select * from actor;

select first_name from actor;

select * from actor where first_name="NICK";

select * from actor where actor_id>10;

# AND OR NOT
select * from actor where first_name="NICK" and last_name='WAHLBERG';

select * from actor where first_name="NICK" or last_name='WAHLBERG';

select * from actor where (first_name="NICK" or first_name='DARYL') and last_name='WAHLBERG';

select * from actor where not(first_name="NICK" or last_name='WAHLBERG');


# in operator
select * from actor where first_name="NICK" or first_name='DARYL';
# can be written as
select * from actor where first_name in ("NICK",'DARYL');

select * from actor where last_name='STALLONE' or last_name='WAHLBERG' or last_name='CRAWFORD';

select * from actor where last_name in ('STALLONE', 'WAHLBERG', 'CRAWFORD');

# between and not between

select * from actor where first_name between "DARYL" and "FRED";

select * from actor where first_name not between "DARYL" and "FRED";


select * from actor order by first_name ASC;

select * from actor where last_name='WAHLBERG' order by first_name DESC;

select distinct(first_name) from actor;




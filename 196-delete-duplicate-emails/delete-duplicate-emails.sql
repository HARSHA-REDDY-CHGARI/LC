# Write your MySQL query statement below
delete from person where id not in(select id from(select min(id)  as id from Person group by email) as temp);
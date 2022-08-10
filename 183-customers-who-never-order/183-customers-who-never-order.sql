/* Write your PL/SQL query statement below */
select name as customers 
from Customers 
where id NOT IN (select customerId from orders);
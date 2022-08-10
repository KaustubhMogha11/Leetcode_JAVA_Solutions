/* Write your PL/SQL query statement below */
 select name as Customers  
  from Customers LEFT JOIN Orders 
  ON Customers.id = Orders.customerId
  where customerId is null;
/* Write your PL/SQL query statement below */
Select firstName,
lastName,
city,
state from Person LEFT JOIN Address ON (Person.personId=Address.personId)
/* Write your PL/SQL query statement below */
select d.name department,e.name employee ,e.salary salary from employee e,department d where e.departmentid=d.id and
e.salary=(select max(distinct salary) from employee group by departmentid having departmentid=e.departmentid);
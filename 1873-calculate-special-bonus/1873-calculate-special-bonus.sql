# Write your MySQL query statement below
select employee_id,
if((employee_id%2) AND (name NOT LIKe "M%"),salary,0) as bonus
from Employees
ORDER BY employee_id;
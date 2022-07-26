/* Write your PL/SQL query statement below */
(Select Max(salary) "SecondHighestSalary" from Employee where Salary<>(Select Max(Salary) from Employee));
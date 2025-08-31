# Write your MySQL query statement below
select euni.unique_id, e.name
from Employees as e
left join EmployeeUNI as euni
on euni.id = e.id;
# Write your MySQL query statement below
select e1.name 
from employee e1
join (select managerId
    from employee 
    group by managerId
    having count(id) >= 5) as t
    on e1.id = t.managerId;
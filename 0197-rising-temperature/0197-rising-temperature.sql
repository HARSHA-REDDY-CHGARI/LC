# Write your MySQL query statement below
select a.id 
from Weather a 
JOIN Weather b
  On DATEDIFF(a.recordDate,b.recordDate)=1
  where a.temperature>b.temperature;

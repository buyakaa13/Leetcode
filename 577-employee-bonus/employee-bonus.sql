/* Write your T-SQL query statement below */
SELECT A.name, B.bonus FROM Employee A
LEFT OUTER JOIN Bonus B ON A.empId = B.empId
WHERE ISNULL(B.bonus, 0) < 1000
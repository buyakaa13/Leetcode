/* Write your T-SQL query statement below */
SELECT B.unique_id, A.name FROM Employees A
LEFT OUTER JOIN EmployeeUNI B ON A.id = B.id 
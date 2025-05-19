/* Write your T-SQL query statement below */
SELECT ISNULL(A.employee_id, B.employee_id) AS employee_id FROM Salaries A
FULL OUTER JOIN Employees B ON A.employee_id = B.employee_id
WHERE B.employee_id IS NULL OR A.salary IS NULL
ORDER BY ISNULL(A.employee_id, B.employee_id)
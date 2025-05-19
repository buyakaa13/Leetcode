/* Write your T-SQL query statement below */
SELECT project_id, ROUND(AVG(CAST(B.experience_years AS DECIMAL(10, 2))), 2) AS average_years FROM Project A
INNER JOIN Employee B ON A.employee_id = B.employee_id
GROUP BY project_id
ORDER BY project_id
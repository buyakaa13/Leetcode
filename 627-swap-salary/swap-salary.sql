/* Write your T-SQL query statement below */
UPDATE Salary SET sex = CASE sex WHEN 'f' THEN 'm' ELSE 'f' END
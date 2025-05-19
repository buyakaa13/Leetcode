/* Write your T-SQL query statement below */
SELECT MAX(num) AS num FROM (SELECT num FROM MyNumbers
GROUP BY num
HAVING COUNT(0) = 1) AS num
/* Write your T-SQL query statement below */
SELECT (SELECT TOP 1 num FROM MyNumbers
GROUP BY num
HAVING COUNT(0) = 1
ORDER BY num DESC) AS num
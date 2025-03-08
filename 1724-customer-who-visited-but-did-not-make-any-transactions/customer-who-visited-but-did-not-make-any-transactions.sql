/* Write your T-SQL query statement below */
SELECT A.customer_id, COUNT(0) AS count_no_trans FROM Visits A
LEFT JOIN Transactions B ON A.visit_id = B.visit_id
WHERE B.visit_id IS NULL
GROUP BY A.customer_id
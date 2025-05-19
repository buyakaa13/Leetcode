/* Write your T-SQL query statement below */
SELECT DISTINCT B.product_id, B.product_name FROM Sales A
LEFT JOIN Product B ON A.product_id = B.product_id
GROUP BY B.product_id, B.product_name
HAVING MIN(A.sale_date) >= '2019-01-01' AND MAX(A.sale_date) <= '2019-03-31'

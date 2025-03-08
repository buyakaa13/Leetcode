/* Write your T-SQL query statement below */
-- SELECT B.product_name, A.year, A.price FROM Sales A
-- INNER JOIN Product B ON A.product_id = B.product_id

SELECT A.product_name, B.year, B.price 
FROM Product A
JOIN Sales B ON A.product_id = B.product_id
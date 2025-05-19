/* Write your T-SQL query statement below */
SELECT name FROM SalesPerson
WHERE sales_id NOT IN (SELECT DISTINCT B.sales_id FROM Orders A
INNER JOIN SalesPerson B ON A.sales_id = B.sales_id
INNER JOIN Company C ON A.com_id = C.com_id
WHERE C.name = 'RED')
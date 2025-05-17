# Write your MySQL query statement below
SELECT A.name AS Customers FROM Customers A
LEFT OUTER JOIN Orders B ON A.id = B.customerId
WHERE B.id IS NULL
-- /* Write your T-SQL query statement below */
SELECT A.name, SUM(ISNULL(B.distance, 0)) AS travelled_distance FROM Users A
LEFT OUTER JOIN Rides B ON A.id = B.user_id
GROUP BY A.name, B.user_id
ORDER BY 2 DESC, 1 ASC
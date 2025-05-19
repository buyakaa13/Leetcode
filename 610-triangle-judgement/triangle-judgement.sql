/* Write your T-SQL query statement below */
SELECT x, y, z, IIF ((x+y > z AND y+z>x AND z+x>y), 'Yes', 'No') AS triangle FROM Triangle
SELECT A.id FROM Weather A
INNER JOIN Weather B ON A.recordDate = ISNULL(DATEADD(day, 1, B.recordDate), B.recordDate)
WHERE A.temperature > B.temperature
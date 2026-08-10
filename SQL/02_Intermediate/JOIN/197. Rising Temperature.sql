SELECT b.id as Id
FROM Weather a
JOIN Weather b
ON DATEDIFF(b.recordDate, a.recordDate)=1
WHERE a.temperature < b.temperature;
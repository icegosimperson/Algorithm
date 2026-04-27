-- 연속으로 3번 등장(count id) 하는 num
-- LEAD : 현재 행과 다음 행을 비교해야 할 때 사용
-- LEAD(가져올_컬럼, 몇_칸_뒤, 값이_없을_때_채울_값) OVER (ORDER BY 정렬_기준)
SELECT DISTINCT num as ConsecutiveNums
FROM (
    SELECT num,
        LEAD(num, 1) OVER (ORDER BY id) AS next1,
        LEAD(num, 2) OVER (ORDER BY id) AS next2
    FROM Logs
) Logs
WHERE num = next1 AND next1=next2;
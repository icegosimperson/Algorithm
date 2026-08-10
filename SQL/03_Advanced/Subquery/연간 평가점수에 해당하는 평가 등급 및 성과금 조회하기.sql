-- solve1
SELECT EMP_NO, EMP_NAME, GRADE,
        CASE
                WHEN GRADE='S' THEN SAL * 0.2
                WHEN GRADE='A' THEN SAL * 0.15
                WHEN GRADE='B' THEN SAL * 0.1
                ELSE 0
        END AS 'BONUS'
FROM (
        SELECT e.EMP_NO, e.EMP_NAME, e.SAL,
            CASE
                WHEN AVG(SCORE)>=96 THEN 'S'
                WHEN AVG(SCORE)>=90 THEN 'A'
                WHEN AVG(SCORE)>=80 THEN 'B'
                ELSE 'C'
            END AS GRADE
        FROM HR_GRADE g JOIN HR_EMPLOYEES e
        ON g.EMP_NO = e.EMP_NO
        GROUP BY e.EMP_NO, e.EMP_NAME, e.SAL
) t
ORDER BY EMP_NO;

-- solve2
SELECT e.EMP_NO, e.EMP_NAME,
        CASE
            WHEN AVG(SCORE)>=96 THEN 'S'
            WHEN AVG(SCORE)>=90 THEN 'A'
            WHEN AVG(SCORE)>=80 THEN 'B'
            ELSE 'C'
        END AS GRADE,
            CASE
                WHEN AVG(SCORE)>=96 THEN SAL * 0.2
                WHEN AVG(SCORE)>=90 THEN SAL * 0.15
                WHEN AVG(SCORE)>=80 THEN SAL * 0.1
            ELSE 0
                END AS 'BONUS'
FROM HR_GRADE g JOIN HR_EMPLOYEES e
ON g.EMP_NO = e.EMP_NO
GROUP BY e.EMP_NO, e.EMP_NAME, e.SAL
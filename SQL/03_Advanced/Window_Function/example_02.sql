SELECT DEPT, GENDER, EMP_ID
FROM (
    SELECT
        DEPT,
        GENDER,
        EMP_ID,
        -- 여기서 RANK가 낮은 순(1등)으로 번호
        ROW_NUMBER() OVER (PARTITION BY DEPT, GENDER ORDER BY RANK ASC) as rn
    FROM 테이블
) t
WHERE rn = 1; -- 등수가 1등인 사람만 딱 뽑기
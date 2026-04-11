SELECT DEPT, GENDER, EMP_ID
FROM 테이블
WHERE (DEPT, GENDER, RANK) IN (
    -- 부서별, 성별별로 가장 높은 순위(최소값)만 먼저 뽑아서
    SELECT DEPT, GENDER, MIN(RANK)
    FROM 테이블
    GROUP BY DEPT, GENDER
);
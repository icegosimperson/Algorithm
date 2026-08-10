-- 날짜 포맷: DATE_FORMAT(컬럼명, '%Y-%m-%d') AS 컬럼명
-- 조건별 분기: CASE
        --      WHEN 조건1 THEN '결과1'
        --      WHEN 조건2 THEN '결과2'
        --      ELSE '나머지 결과'
        --  END AS 새로운_컬럼명
-- 날짜 차이 계산: DATEDIFF(종료일, 시작일) + 1
    -- DATEDIFF('2022-09-02', '2022-09-01') 결과=> 1
    -- 총 대여 기간은 2일 이기에, +1 필요
    -- DATEDIFF(END_DATE, START_DATE) + 1
-- 문자열 패턴 매칭: WHERE ... LIKE '패턴'('2022-09%')
SELECT HISTORY_ID, CAR_ID, DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE, DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
    CASE
        WHEN DATEDIFF(END_DATE, START_DATE) + 1 >= 30 THEN '장기 대여'
        ELSE '단기 대여'
    END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE LIKE '2022-09%'
ORDER BY HISTORY_ID DESC;
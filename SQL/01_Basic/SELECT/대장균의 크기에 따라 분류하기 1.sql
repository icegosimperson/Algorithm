SELECT id,
    CASE
        WHEN SIZE_OF_COLONY<=100 THEN 'LOW'
        WHEN SIZE_OF_COLONY<=1000 THEN 'MEDIUM'
    ELSE 'HIGH'
    END AS SIZE
FROM ECOLI_DATA
ORDER BY id;

---- (예시) 대장균 크기가 딱 특정 숫자와 일치하는지 확인할 때 사용하는 문법 형태
--SELECT
--    ID,
--    CASE SIZE_OF_COLONY
--        WHEN 100 THEN 'LOW'
--        WHEN 1000 THEN 'MEDIUM'
--        ELSE 'HIGH'
--    END AS SIZE
--FROM ECOLI_DATA
--ORDER BY ID ASC;
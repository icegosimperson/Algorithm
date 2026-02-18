-- [범위별 그룹화 복습]
-- 1. CASE WHEN 방식
--    - 범위가 불규칙할 때 유용하지만, 경계값(미만/이하) 처리에 주의
-- 2. 가격 단위 분류(TRUNCATE, 특정 자리수 버림)
--    - TRUNCATE(PRICE, -4) 또는 (PRICE DIV 10000) * 10000 사용
--    - 규칙적인 구간(만원 단위 등)을 나눌 때 훨씬 간결하고 확장성이 좋음
-- 3. GROUP BY의 기준
--    - 반드시 '가공된 결과물(PRICE_GROUP)'을 기준으로 묶어야 통계가 정확

SELECT TRUNCATE(PRICE, -4) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP;
-- 서브쿼리 : 확실한 기준 리스트 생성

-- 1. 틀린 이유(서브쿼리 사용x)
-- GROUP BY를 쓰면 데이터가 '압축'
-- 이때 MAX(가격)은 제일 큰 숫자를 잘 가져오지만, 이름은 압축된 데이터 중 아무거나(보통 첫 줄) 가져온다.
-- 결과적으로 최대 가격과 제품 이름이 서로 일치하지 않는 '데이터 꼬임' 현상이 발생한다.
--
-- 2. 서브쿼리 사용o
-- "가장 ~한 것의 상세 정보(이름, ID 등)를 보고 싶을 때"는 무조건 서브쿼리를 사용
-- 공식: 서브쿼리로 (카테고리, 최대가격) 리스트를 먼저 만든다.
-- 메인쿼리 WHERE절에서 (카테고리, 가격) IN (서브쿼리)를 써서 진짜 짝꿍을 찾는다.

SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE (CATEGORY, PRICE) IN (
    SELECT CATEGORY, MAX(PRICE)
    FROM FOOD_PRODUCT
    WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
    GROUP BY CATEGORY
)
ORDER BY MAX_PRICE DESC;
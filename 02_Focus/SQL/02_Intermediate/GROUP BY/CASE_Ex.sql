--time_slot	order_count
--00-08	24
--08-16	156
--16-24	98
SELECT
    CASE
        WHEN HOUR(ORDER_AT) >= 8 AND HOUR(ORDER_AT) < 16 THEN '08-16'
        WHEN HOUR(ORDER_AT) >= 16 AND HOUR(ORDER_AT) < 24 THEN '16-24'
        ELSE '00-08'
    END AS time_slot,
    COUNT(*) AS order_count
FROM orders
GROUP BY time_slot;
SELECT score, rnk as "rank"
FROM (
    SELECT score,
        DENSE_RANK() OVER (ORDER BY score DESC) as rnk
    FROM Scores
)sub;
--SELECT *
--FROM (
--    SELECT score,
--        DENSE_RANK () OVER (ORDER BY score DESC) as "rank"
--    FROM Scores
--)Scores;
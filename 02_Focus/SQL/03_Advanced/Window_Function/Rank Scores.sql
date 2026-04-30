SELECT score, rnk as "rank"
FROM (
    SELECT score,
        DENSE_RANK() OVER (ORDER BY score DESC) as rnk
    FROM Scores
)sub;
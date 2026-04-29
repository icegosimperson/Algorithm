CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    RETURN(
        SELECT DISTINCT salary
        FROM(
            SELECT salary,
                DENSE_RANK() OVER (ORDER BY salary DESC) as rk
            FROM Employee
        ) AS e
        WHERE rk = N
);
END
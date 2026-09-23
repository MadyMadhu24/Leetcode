# Write your MySQL query statement below
SELECT name, sum(amount) AS balance 
FROM Users u
LEFT JOIN Transactions t
ON u.account=t.account
GROUP BY t.account
HAVING sum(amount)>10000;
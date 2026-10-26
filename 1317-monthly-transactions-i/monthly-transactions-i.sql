# Write your MySQL query statement below
SELECT 
DATE_FORMAT(trans_date, '%Y-%m') month , 
country ,
COUNT(id) trans_count , 
SUM(state='approved') AS approved_count, 
SUM(amount) AS trans_total_amount , 
SUM(IF(state='approved',amount, 0)) approved_total_amount
FROM Transactions
GROUP BY month, country
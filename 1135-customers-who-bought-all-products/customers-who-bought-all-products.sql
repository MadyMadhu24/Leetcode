# Write your MySQL query statement below
SELECT customer_id
FROM Customer c
LEFT JOIN Product p
ON c.product_key = p.product_key 
GROUP BY c.customer_id
HAVING COUNT(DISTINCT p.product_key)=(SELECT COUNT(*) FROM PRODUCT);
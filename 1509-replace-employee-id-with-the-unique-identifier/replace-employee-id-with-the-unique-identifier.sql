# Write your MySQL query statement below
SELECT eu.unique_id AS unique_id,
ep.name AS name
FROM Employees ep
LEFT JOIN EmployeeUNI eu
ON ep.id=eu.id

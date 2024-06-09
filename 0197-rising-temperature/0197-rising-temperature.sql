# Write your MySQL query statement below


/*SELECT C.id FROM 

Weather AS C JOIN Weather AS P 

ON DATEDIFF(C.recordDate,P.recordDate) =1 AND C.temperature > 

p.temperature; */


# Write your MySQL query statement below


SELECT C.id FROM 

Weather AS C , Weather AS P 

WHERE DATEDIFF(C.recordDate,P.recordDate) =1 AND C.temperature > 

p.temperature;
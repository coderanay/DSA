SELECT name, population, area
FROM World
WHERE area BETWEEN 3000000 AND (SELECT MAX(area) FROM World)
   OR population BETWEEN 25000000 AND (SELECT MAX(population) FROM World);

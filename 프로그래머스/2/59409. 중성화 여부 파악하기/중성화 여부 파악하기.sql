SELECT 
    animal_id, 
    name, 
    IF(SEX_UPON_INTAKE LIKE 'Neutered%' OR SEX_UPON_INTAKE LIKE 'Spayed%', 'O', 'X') AS 중성화
FROM 
    animal_ins
ORDER BY 
    animal_id ASC;

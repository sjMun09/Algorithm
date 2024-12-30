-- 동물의 이름은 몇 개인지 조회 / 이름 not null
-- 이 중 NULL과 중복되는 이름을 고려하면, 보호소에 들어온 동물 이름의 수는 
SELECT count(DISTINCT NAME)
FROM ANIMAL_INS
WHERE NAME is not null
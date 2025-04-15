-- 코드를 입력하세요
SELECT i.ingredient_type, f.sub(total_order) from i.ICECREAM_INFO, f.first_half
where i.flavor = i.ingredient_type and i.flavor = f.total_order;
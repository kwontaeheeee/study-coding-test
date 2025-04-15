-- 코드를 입력하세요
SELECT i.ingredient_type, sum(f.total_order) as total_order from icecream_info i, first_half f
where i.flavor = f.flavor group by i.ingredient_type;
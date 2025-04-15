-- 코드를 입력하세요
SELECT ins.name, ins.datetime from animal_ins ins
left outer join animal_outs outs on ins.animal_id = outs.animal_id
where outs.animal_id is null
order by ins.datetime
limit 0,3;
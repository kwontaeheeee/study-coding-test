SELECT count(*) as fish_count, month(time) as month from `FISH_INFO`
GROUP BY MONTH(time) ORDER BY MONTH(TIME) asc;
select count(fish_type) as fish_count, max(length) as max_length, fish_type
from fish_info
group by fish_type
having ifnull(avg(length),10) >= 33
order by fish_type asc;
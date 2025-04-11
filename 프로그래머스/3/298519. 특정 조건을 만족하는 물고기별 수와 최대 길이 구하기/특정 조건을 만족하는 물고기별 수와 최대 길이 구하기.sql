select  avg(max(length)) as max_length, 
from fish_info
where avg(length) >= 33;
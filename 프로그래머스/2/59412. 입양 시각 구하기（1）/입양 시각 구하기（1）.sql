select hour(datetime) as hour, count(*) from animal_outs
where time(datetime) between '09:00:00' and '19:59:00'
group by hour order by hour asc;
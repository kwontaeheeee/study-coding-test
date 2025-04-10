SELECT LEFT( `PRODUCT_CODE`,2) as 'category' , count (PRODUCT_ID) as'products'
from `PRODUCT` GROUP BY category;

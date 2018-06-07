SELECT COUNT(*), CATEGORY_NAME
FROM PRODUCT_ITEM PI
LEFT JOIN PRODUCT PR
      on PI.PRODUCT_ID = PR.PRODUCT_ID
LEFT JOIN USER_ORDER UO
      on UO.ORDER_ID = PI.ORDER_ID
LEFT JOIN CATEGORY CAT
      on CAT.CATEGORY_ID = PR.CATEGORY_ID
WHERE UO.ORDER_STATUS = 'COMPLETED'
GROUP BY PR.CATEGORY_ID
ORDER BY COUNT(*) DESC
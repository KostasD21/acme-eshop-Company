INSERT INTO ACME_USER (id, username, password, name, surname, email, phone_number, address, post_code, role, token) VALUES (1, 'peloUser', 'pelo1234', 'Pelopidas', 'Pelopidakis', 'SPARTH21@gmail.com', '6984444455', 'Sparth', '40101','REGISTERED_USER', 'mVHJTAcTcV');
INSERT INTO ACME_USER (id, username, password, name, surname, email, phone_number, address, post_code, role, token) VALUES (2, 'manwlhsUser', 'manwlhs1234', 'Manwlios', 'Papadomanwlakis', 'CreteGR@gmail.com', '6983334455', 'Crete', '40102','REGISTERED_USER', 'SMCQJSmm4l');
INSERT INTO ACME_USER (id, username, password, name, surname, email, phone_number, address, post_code, role, token) VALUES (3, 'shfhsUser', 'shfhs1234', 'Iwshf', 'Sifakis', 'sfakianiPita@gmail.com', '6982224455', 'SFAKIA', '40103','REGISTERED_USER', '16ReGTuEGZ');
INSERT INTO ACME_USER (id, username, password, name, surname, email, phone_number, address, post_code, role, token) VALUES (4, 'petrosUser', 'petros1234', 'Petros', 'Petrakis','petros@gmail.com', '6981114455', 'ATHENS', '40104', 'REGISTERED_USER', 'aCYl3WDErB');

INSERT INTO CATEGORY (CATEGORY_ID, CATEGORY_NAME, description) VALUES (1, 'Desktop PC', 'Category for Desktop PCs');
INSERT INTO CATEGORY (CATEGORY_ID, CATEGORY_NAME, description) VALUES (2, 'Laptop', 'Category for Laptops');
INSERT INTO CATEGORY (CATEGORY_ID, CATEGORY_NAME, description) VALUES (3, 'Tablet', 'Category for Tablets');
INSERT INTO CATEGORY (CATEGORY_ID, CATEGORY_NAME, description) VALUES (4, 'Smart Phone', 'Category for Smartphones');
INSERT INTO CATEGORY (CATEGORY_ID, CATEGORY_NAME, description) VALUES (5, 'TV', 'Category for TVs');

INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (1, 'LIMITED', 6);
INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (2, 'IN_STOCK', 100);
INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (3, 'IN_STOCK', 43);
INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (4, 'IN_STOCK', 30);
INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (5, 'OUT_OF_STOCK', 0);
INSERT INTO PRODUCT_STOCK (id, availability, stock) VALUES (6, 'OUT_OF_STOCK', 0);

INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (1, 'Acer Aspire X', 'Normal laptop','Nvidia GTX 555','product Code 222', 800,2,1);
INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (2, 'Acer Aspire S', 'Normal laptop','Nvidia GTX 777','product Code 777', 400,2, 2);
INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (3, 'Acer Aspire X200', 'Normal Desktop','Nvidia GTX 555','product Code 555', 800,1,3);
INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (4, 'Acer Aspire S440', 'Normal Desktop','Nvidia GTX 777','product Code 888', 400,3, 4);
INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (5, 'Nokia X6', 'Smartphone','Nokia X6','product Code 333', 250,4, 5);
INSERT INTO PRODUCT (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (6, 'Samsung Galaxy S9', 'Smartphone','Samsung Galaxy S9','product Code 999', 800, 4, 6);

INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (1, 2400, 1);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (2, 400, 2);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (3, 2000, 2);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (4, 50, 3);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (5, 130, 3);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (6, 130, 4);

INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (1, 'Sparth', '40101', 'COURIER', 'PAYPAL', 'RECEIPT');
INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (2, 'Feidippidoy', '34394', 'COURIER', 'PAY_ON_DELIVERY', 'RECEIPT');
INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (3, 'SFAKIA', '40100', 'FROM_SHOP', 'CREDIT_CARD', 'INVOICE');
INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (4, 'Crete', '41100', 'COURIER', 'PAYPAL', 'INVOICE');
INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (5, 'SFAKIA', '40100', 'FROM_SHOP', 'CREDIT_CARD', 'INVOICE');
INSERT INTO BILLING_DETAILS (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (6, 'Sparth', '40101', 'FROM_SHOP', 'CREDIT_CARD', 'RECEIPT');

INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (1, sysdate, 1, 'COMPLETED', 1, 'yQzEpiLO2r');
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (2, sysdate, 2, 'ERROR', null, '20y21iVQge');
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (3, sysdate, 3, 'CANCELED', 3, 'IccGuq6fl3');
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (4, sysdate, 4, 'COMPLETED', 2, 'wfQgooTXwz');
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (5, sysdate, 5, 'COMPLETED', 3, '81GPMDOEAm');
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID, REFERENCE) VALUES (6, sysdate, 6, 'COMPLETED', 1, 'G46ABqt1MN');

INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (1, 1600, 2, null, 1, 1);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (2, 800, 1, null, 2, 1);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (3, 400, 1, null, 2, 2);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (4, 2000, 4, 1, 1, null);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (5, 50, 1, 4, 2, null);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (6, 130, 1, 5, 3, null);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (7, 130, 1, 6, 2, null);

INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (1, sysdate, 1, '4832948', 'PAYPAL', 2000, 'ACCEPTED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (2, sysdate, 2, '5234235', null, 44, 'ERROR');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (3, sysdate, 3, '234324', 'VISA', 56, 'CANCELED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (4, sysdate, 4, '643543', 'PAYPAL', 50,  'ACCEPTED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (5, sysdate, 5, '12343225', 'MASTERCARD', 130, 'ACCEPTED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (6, sysdate, 6, '453643643', 'MASTERCARD', 130, 'ACCEPTED');





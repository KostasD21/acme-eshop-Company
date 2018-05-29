INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (1, 'Pelo', '11234579', 'Pelopidas', 'Papadopoulos', 'SPARTH21@gmail.com', '111456789', 'Sparth', '40101','REGISTERED_USER');
INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (2, 'Manwlhs', '1235424545', 'Manolios', 'Papadomanwlakis', 'CreteGR@gmail.com', '123456789', 'Crete', '41100','REGISTERED_USER');
INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (3, 'Shfhs', '12342138', 'Iwshf', 'Sifakas', 'sfakianiPita@gmail.com', '12411323', 'SFAKIA', '40100','REGISTERED_USER');

INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (1, 'Desktop PC', 'Category for Desktop PCs');
INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (2, 'Laptop', 'Category for Laptops');
INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (3, 'Tablet', 'Category for Tablets');
INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (4, 'Smart Phone', 'Category for Smartphones');
INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (5, 'TV', 'Category for TVs');

INSERT INTO product_stock (id, availability, stock) VALUES (1, 'IN_STOCK', 20);
INSERT INTO product_stock (id, availability, stock) VALUES (2, 'IN_STOCK', 100);
INSERT INTO product_stock (id, availability, stock) VALUES (3, 'IN_STOCK', 43);
INSERT INTO product_stock (id, availability, stock) VALUES (4, 'IN_STOCK', 80);

INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (1, 'Acer Aspire X', 'Normal laptop','Nvidia GTX 555','product Code 555', 800,2,1);
INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (2, 'Acer Aspire S', 'Normal laptop','Nvidia GTX 777','product Code 777', 400,2, 2);
INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (3, 'Acer Aspire X', 'Normal Desktop','Nvidia GTX 555','product Code 555', 800,1,3);
INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (4, 'Acer Aspire S', 'Normal Desktop','Nvidia GTX 777','product Code 777', 400,3, 4);

INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (1, 2400, 1);
INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (2, 400, 2);

INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (1, 1600, 2, null, 1, 1);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (2, 800, 1, null, 2, 1);
INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (3, 400, 1, null, 2, 2);

INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (1, 'Sparth', '40101', 'COURIER', 'PAYPAL', 'RECEIPT');
INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (2, 'Feidippidoy', '34394', 'COURIER', 'PAY_ON_DELIVERY', 'RECEIPT');
INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (3, 'SFAKIA', '40100', 'FROM_SHOP', 'CREDIT_CARD', 'INVOICE');
INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (4, 'Crete', '41100', 'COURIER', 'PAYPAL', 'INVOICE');
INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (5, 'SFAKIA', '40100', 'FROM_SHOP', 'CREDIT_CARD', 'INVOICE');
INSERT INTO billing_details (BILLING_DETAILS_ID, ADDRESS, POST_CODE, SHIPPING_METHOD, PAYMENT_METHOD, RECEIPT_METHOD) VALUES (6, 'Sparth', '40101', 'FROM_SHOP', 'CREDIT_CARD', 'RECEIPT');

INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (1, sysdate, 1, 'COMPLETED', 1);
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (2, sysdate, 2, 'ERROR', null);
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (3, sysdate, 3, 'CANCELED', 3);
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (4, sysdate, 4, 'COMPLETED', 2);
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (5, sysdate, 5, 'COMPLETED', 3);
INSERT INTO USER_ORDER (ORDER_ID, ORDER_DATE, BILLING_DETAILS_ID, ORDER_STATUS, USER_ID) VALUES (6, sysdate, 6, 'COMPLETED', 1);

INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (1, sysdate, 1, '4832948', 'PAYPAL', 20, 'COMPLETED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (2, sysdate, 2, '5234235', null, 44, 'ERROR');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (3, sysdate, 3, '234324', 'VISA', 56, 'CANCELED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (4, sysdate, 4, '643543', 'PAYPAL', 120,  'COMPLETED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (5, sysdate, 5, '12343225', 'MASTERCARD', 245, 'COMPLETED');
INSERT INTO PURCHASE (PURCHASE_ID, PURCHASE_DATE, ORDER_ID, REFERENCE_ID, PROVIDER, AMOUNT, PURCHASE_STATUS) VALUES (6, sysdate, 6, '453643643', 'MASTERCARD', 50, 'COMPLETED');





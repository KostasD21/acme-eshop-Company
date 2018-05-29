--INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (1, 'Pelo', '11234579', 'Pelopidas', 'Papadopoulos', 'SPARTH21@gmail.com', '111456789', 'Sparth', '40101','REGISTERED_USER');
--INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (2, 'Manwlhs', '1235424545', 'Manolios', 'Papadomanwlakis', 'CreteGR@gmail.com', '123456789', 'Crete', '41100','REGISTERED_USER');
--INSERT INTO AcmeUser (id, username, password, name, surname, email, phone_number, address, post_code, role) VALUES (3, 'Shfhs', '12342138', 'Iwshf', 'Sifakas', 'sfakianiPita@gmail.com', '12411323', 'SFAKIA', '40100','REGISTERED_USER');

--INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (5, 'Desktop PC', 'Category for Desktop PCs');
--INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (6, 'Laptop', 'Category for Laptops');
--INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (7, 'Tablet', 'Category for Tablets');
--INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (8, 'Smart Phone', 'Category for Smartphones');
--INSERT INTO category (CATEGORY_ID, CATEGORY_NAME, description) VALUES (9, 'TV', 'Category for TVs');

--INSERT INTO product_stock (id, availability, stock) VALUES (1, 'IN_STOCK', 20);
--INSERT INTO product_stock (id, availability, stock) VALUES (2, 'IN_STOCK', 100);
--INSERT INTO product_stock (id, availability, stock) VALUES (3, 'IN_STOCK', 43);
--INSERT INTO product_stock (id, availability, stock) VALUES (4, 'IN_STOCK', 80);

--INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (1, 'Acer Aspire X', 'Normal laptop','Nvidia GTX 555','product Code 555', 800,6,1);
--INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (2, 'Acer Aspire S', 'Normal laptop','Nvidia GTX 777','product Code 777', 400,6, 2);
--INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (3, 'Acer Aspire X', 'Normal Desktop','Nvidia GTX 555','product Code 555', 800,5,3);
--INSERT INTO product (product_id, title, short_description, long_description, product_code, price,category_id, product_stock_id) VALUES (4, 'Acer Aspire S', 'Normal Desktop','Nvidia GTX 777','product Code 777', 400,7, 4);







--INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (1, 2400, 1);
--INSERT INTO shopping_basket (shopping_basket_id, total_amount, user_id) VALUES (2, 400, 2);

--INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (1, 1600, 2, null, 1, 1);
--INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (2, 800, 1, null, 2, 1);
--INSERT INTO product_item (product_item_id, amount, quantity, order_id, product_id, shopping_basket_id) VALUES (3, 400, 1, null, 2, 2);
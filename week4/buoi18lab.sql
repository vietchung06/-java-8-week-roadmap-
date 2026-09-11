USE buoi17;
CREATE TABLE order_items (
id INT PRIMARY KEY AUTO_INCREMENT,
order_id INT,
product_id INT,
quantity INT DEFAULT 0,
price_at_purchase DECIMAL(10,2) NOT NULL,
FOREIGN KEY (order_id) REFERENCES orders(id),
FOREIGN KEY (product_id) REFERENCES products(id)

);
INSERT INTO order_items (order_id, product_id, quantity, price_at_purchase)
VALUES

(31, 32, 1, 15000000),
(31, 35, 3, 500000),
(31, 40, 5, 1200000),
(31, 45, 2, 350000),
(31, 50, 4, 800000),

(32, 33, 2, 12000000),
(32, 36, 5, 750000),
(32, 42, 1, 900000),
(32, 46, 4, 300000),
(33, 34, 3, 8500000),
(33, 37, 1, 650000),
(33, 43, 5, 1500000),
(33, 51, 2, 450000),

(34, 35, 4, 500000),
(34, 39, 2, 2200000),
(34, 44, 5, 350000),
(34, 52, 3, 800000),

(35, 36, 1, 750000),
(35, 40, 4, 1200000),
(35, 45, 2, 350000),
(35, 50, 5, 800000),
(35, 54, 3, 500000),

(36, 39, 5, 2200000),
(36, 42, 1, 900000),
(36, 46, 3, 300000),
(36, 55, 4, 650000),

(37, 43, 2, 1500000),
(37, 44, 5, 350000),
(37, 51, 1, 450000),
(37, 57, 3, 750000),

(38, 32, 4, 15000000),
(38, 45, 2, 350000),
(38, 52, 5, 800000),
(38, 54, 1, 500000),

(39, 33, 3, 12000000),
(39, 46, 5, 300000),
(39, 50, 2, 800000),
(39, 55, 4, 650000),

(40, 34, 1, 8500000),
(40, 37, 3, 650000),
(40, 42, 5, 900000),
(40, 51, 2, 450000),
(40, 54, 4, 500000),
(40, 55, 3, 650000),
(40, 57, 2, 750000);

-- đơn hàng + ten khach
SELECT o.id, o.order_date, o.order_status, c.name FROM orders o
LEFT JOIN customers c
ON o.customer_id = c.id;
-- Đơn hàng kèm từng dòng sản phẩm
SELECT o.id, p.name, oi.quantity, oi.price_at_purchase FROM orders o
INNER JOIN order_items oi
ON o.id = oi.order_id
INNER JOIN products p
ON p.id = oi.product_id;
-- sản phẩm chưa từng được mua (LEFT JOIN)
SELECT p.name, o.quantity, o.price_at_purchase FROM products p
LEFT JOIN order_items o
ON p.id = o.product_id
WHERE o.id IS NULL;
-- đơn của 1 khách cụ thể
SELECT o.id,o.order_status, c.name, oi.quantity , oi.price_at_purchase FROM customers c
INNER JOIN orders o
ON o.customer_id = c.id
INNER JOIN order_items oi
ON oi.order_id = o.id
INNER JOIN products p
ON p.id = oi. product_id
WHERE customer_id = 3;

-- tổng tiền từng đơn (SUM(quantity * price_at_purchase) — chớm dùng GROUP BY
SELECT order_id,
       SUM(quantity * price_at_purchase) AS tong_tien
FROM order_items
GROUP BY order_id;
-- danh mục kèm số sản phẩm
SELECT categories.name,
       COUNT(products.id) AS so_san_pham
FROM categories
LEFT JOIN products
ON categories.id = products.category_id
GROUP BY categories.id, categories.name;

SELECT * FROM products;
SELECT * FROM order_items;
SELECT * FROM orders;
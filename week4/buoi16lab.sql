USE shop_lap;

CREATE TABLE categories (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL
);
ALTER TABLE categories
ADD UNIQUE (name);

CREATE TABLE products (
id INT PRIMARY KEY AUTO_INCREMENT,
category_id INT,
name VARCHAR(100) NOT NULL,
price DECIMAL(10,2) NOT NULL,
quantity INT DEFAULT 0
);
CREATE TABLE customers (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL ,
email VARCHAR(200) UNIQUE,
sdt VARCHAR(20) 
);
CREATE TABLE orders (
id INT PRIMARY KEY AUTO_INCREMENT,
customer_id INT,
order_date DATE ,
order_status VARCHAR(100) NOT NULL

);

INSERT INTO categories (name)
VALUES ('ÁO');
INSERT INTO categories (name)
VALUES ('Giày'),('Dép'), ('Mũ');
INSERT INTO products (category_id, name, price, quantity)
VALUES (2, 'Áo gió', 1000, 20);
INSERT INTO customers (name, email, sdt)
VALUES ('Chung', 'CN123@gmail.com', '0987654321');
INSERT INTO orders  (customer_id, order_date, trangThai)
VALUES (1,  '2026/8/9', 'Đang đặt đơn');

SHOW TABLES;
DESCRIBE categories;-- Xem cấu trúc bảng
DESCRIBE products;
DESCRIBE customers;
DESCRIBE orders;
SELECT * FROM categories;
SELECT * FROM products;
SELECT * FROM customers  ;
SELECT * FROM orders;
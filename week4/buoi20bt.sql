CREATE DATABASE buoi20;
USE buoi20;
-- VD bảng orders_flat chứa lẫn tên khách, SĐT, tên sản phẩm, giá... trong 1 bảng
CREATE TABLE orders_flat (
order_id INT NOT NULL,
order_date DATE,
customer_name VARCHAR(100) NOT NULL,
customer_phone VARCHAR(20) NOT NULL,
product_name VARCHAR(100) NOT NULL,
product_price DECIMAL(10,2)
);
INSERT INTO orders_flat
(order_id, order_date, customer_name, customer_phone,
 product_name, product_price)
VALUES
(1, '2026-09-13', 'Chung', '0912345678', 'Chuột', 200000),
(1, '2026-09-13', 'Chung', '0912345678', 'Bàn phím', 500000),
(2, '2026-09-13', 'Nam', '0988888888', 'Chuột', 200000 );

-- customer_name, customer_phone bị lặp lại ở nhiều dòng nếu một khách mua nhiều sản phẩm hoặc nhiều đơn.
-- product_name, product_price bị lặp lại ở nhiều đơn hàng.
-- order_date cũng bị lặp lại cho từng sản phẩm trong cùng một đơn.
-- Dữ liệu về khách hàng, đơn hàng, sản phẩm đang bị trộn chung trong một bảng.
-- Quan hệ nhiều-nhiều giữa orders và products chưa được tách bằng bảng trung gian. 1 đơn → nhiều sản phẩm ,1 sản phẩm → nhiều đơn

CREATE TABLE customers (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
phone VARCHAR(20) NOT NULL
);
CREATE TABLE products (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(200) NOT NULL,
price DECIMAL(10,2)
);
CREATE TABLE orders (
id INT PRIMARY KEY AUTO_INCREMENT,
customer_id INT,
order_date DATE ,
FOREIGN KEY (customer_id) REFERENCES customers(id)
);
CREATE TABLE order_items (
id INT PRIMARY KEY AUTO_INCREMENT,
order_id INT ,
product_id INT ,
quantity INT DEFAULT 0,
price_at_purchase DECIMAL(10,2),
FOREIGN KEY (order_id) REFERENCES orders(id),
FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO customers (name, phone)
VALUES
('Chung', '0912345678'),
('Nam', '0987654321'),
('Anh', '0977111222'),
('Dung', '0966333444');

INSERT INTO products (name, price)
VALUES
('Chuột gaming', 500000),
('Bàn phím cơ', 1200000),
('Tai nghe', 800000),
('Màn hình', 3500000),
('Laptop', 15000000);

INSERT INTO orders (customer_id, order_date)
VALUES
(1, '2026-09-10'),
(1, '2026-09-11'),
(2, '2026-09-11'),
(3, '2026-09-12'),
(4, '2026-09-13');

INSERT INTO order_items
(order_id, product_id, quantity, price_at_purchase)
VALUES
(1, 1, 2, 500000),
(1, 2, 1, 1200000),

(2, 3, 2, 800000),
(2, 1, 1, 500000),

(3, 1, 3, 500000),
(3, 4, 1, 3500000),

(4, 2, 1, 1200000),
(4, 5, 1, 15000000),

(5, 3, 2, 800000),
(5, 4, 1, 3500000);

---- 	Xác định loại quan hệ cho từng cặp: khách-đơn hàng?
-- 1. đơn hàng-sản phẩm? người dùng-hồ sơ chi tiết? học sinh-lớp học? sinh viên-môn học? — vẽ và giải thích.
/*khách hàng quan hệ 1-N đơn hàng 
 * -> 1 khách hàng có thể có nhiều đơn hàng nhưng 1 đơn hàng chỉ thuộc về 1 khách hàng
 * 2. đơn hàng quan hệ N-N sản phẩm
 *  Một đơn hàng có nhiều sản phẩm, một sản phẩm có thể xuất hiện trong nhiều đơn hàng.
 * 3. người dùng quan hệ 1-1 với hồ sơ chi tiết
 * -> 1 người chỉ có 1 hồ sơ thông tin và , 1 hồ sơ chỉ thuộc về 1 người dùng
 * 4. học sinh quan hệ N-1 lớp học
 * -> 1 lớp học có nhiều học sinh nhưng 1 học sinh chỉ học 1 lớp
 * 5. sinh viên quan hệ N-N môn học
 * -> 1 sinh viên có thể học nhiều môn và 1 môn sẽ có nhiều sinh viên học
 * */

-- 3.	Đánh index cho cột hay tìm kiếm trong schema shop (VD products.name, orders.customer_id),
-- dùng EXPLAIN trước/sau để thấy khác biệt.

EXPLAIN 
SELECT * FROM products
WHERE name = 'Laptop';
CREATE INDEX idx_products_name
ON products(name);
--  type = ref -> tra cứu thông qua index
-- key = idx_products_name -> Không sử dụng Index

EXPLAIN 
SELECT * FROM customers
WHERE name = 'Chung';
-- type = ALL -> MySQL quét toàn bộ bảng products
-- key = NULL -> Không sử dụng Index
EXPLAIN 
SELECT * FROM orders
WHERE customer_id =1;
-- 4.	Thiết kế thêm bảng users (đăng nhập: username UNIQUE, password_hash, role) —
--  thảo luận vì sao không bao giờ lưu mật khẩu thô.
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);
INSERT INTO users (username, password_hash, role)
VALUES
('chung', '$2a$10$abcxyz...', 'USER'),
('admin', '$2a$10$defxyz...', 'ADMIN');
/*
 * Bảng users dùng để lưu thông tin đăng nhập.
 *
 * username đặt UNIQUE để tránh trùng tên đăng nhập.
 *
 * Không lưu mật khẩu thô vì nếu database bị lộ,
 * kẻ xấu có thể đọc trực tiếp mật khẩu của người dùng.
 *
 * Thay vào đó lưu password_hash.
 */
SELECT * FROM orders_flat;
SELECT * FROM orders;
SELECT * FROM order_items;
SELECT * FROM customers;
SELECT * FROM products;
SHOW INDEX FROM products;
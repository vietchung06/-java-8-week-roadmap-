CREATE DATABASE shop_db;
USE shop_db;

CREATE TABLE products (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
price DECIMAL(10,2) NOT NULL,
quantity INT DEFAULT 0,
created_at DATETIME 
);

ALTER TABLE products 
ADD COLUMN map TEXT;-- Thêm cột
ALTER TABLE products
RENAME COLUMN map TO product_description;-- Đổi tên cột
ALTER TABLE products-- Xóa cột
DROP COLUMN product_description;


CREATE TABLE customers (
id INT PRIMARY KEY AUTO_INCREMENT,-- Tự động tăng id khi xuống dòng
-- PREMARY KEY → khóa chính, nghĩa là giá trị id của mỗi dòng phải là duy nhất, không được trùng.
full_name VARCHAR(100),-- Bắt buộc phải có giá trị không được để null
email VARCHAR(200) UNIQUE ,-- VARCHAR vì email là chuỗi, UNIQUE để không trùng
phone VARCHAR(20), -- VARCHAR để giữ được số 0 ở đầu
created_at DATETIME
);
INSERT INTO customers (full_name, email)
VALUES ('chung', 'cn123@gmail.com');
INSERT INTO customers ( email)-- Field 'full_name' doesn't have a default value
VALUES ( 'cn1234@gmail.com');
INSERT INTO customers (full_name, email)-- Duplicate entry 'cn123@gmail.com' for key 'customers.email'
VALUES ('chung', 'cn123@gmail.com');

CREATE TABLE students(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100),
score DECIMAL(3,1)-- 3 tổng chữ số , 1 : số chữ số sau dấu thập phân
);
ALTER TABLE students
ADD UNIQUE (name);-- Thêm UNIQUE vào name
show TABLES;
DESCRIBE products;
SELECT * FROM products;-- Lấy tất cả dữ liệu từ bảng products.
DESCRIBE customers;
DESCRIBE students;
SELECT * FROM customers;

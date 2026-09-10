USE buoi17;

CREATE TABLE categories (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) UNIQUE 
);
 CREATE TABLE products (
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(100) NOT NULL,
 price DECIMAL(10,2) NOT NULL,
 quantity INT DEFAULT 0
);
ALTER TABLE products
ADD COLUMN category_id INT;
ALTER TABLE products ADD UNIQUE(name);

CREATE TABLE customers (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
email VARCHAR(200) UNIQUE ,
phone VARCHAR(20)
);
ALTER TABLE customers
ADD UNIQUE (phone);

INSERT INTO categories (name)
VALUES ('Phụ kiện máy tính'),
('Laptop và màn hình'),
('Phụ kiện điện tử'),
('Điện thoại'),
('Phụ kiện điện thoại');

INSERT INTO products (name, price, quantity, category_id)
VALUES ('Màn hình AI', 7500000, 0, 3);,('Gaming Mouse', 850000, 25, 1),
('Bàn phím Gaming', 1500000, 12, 1),
('Tai nghe Gaming Pro', 2200000, 8, 1),
('Bàn phím cơ', 1200000, 30, 1),
('Chuột không dây', 250000, 100, 1),

('Laptop Gaming', 18500000, 5, 2),
('Màn hình Gaming', 7500000, 0, 2),
('Laptop Dell', 15000000, 7, 2),
('MacBook Air', 25000000, 3, 2),

('Balo Laptop', 450000, 45, 3),
('Bộ sạc nhanh', 350000, 60, 3),
('Cáp sạc USB', 80000, 75, 3),

('Điện thoại Samsung', 12000000, 15, 4),
('iPhone 15', 20000000, 4, 4),

('Ốp điện thoại', 50000, 50, 5);


INSERT INTO customers (name, email, phone)
VALUES ('Chung', 'chung@gmail.com', '0987654321'),('Nam', 'nam@gmail.com', '0987654312'),
('Anh', 'anh@gmail.com', '0987564321'),('Bảo', 'bao@gmail.com', '0987677321'),
('Cường', 'cuong@gmail.com', '0967654321'),('Dũng', 'dung@gmail.com', '0987663521'),
('Hùng', 'hung@gmail.com', '0987654679'),('Khánh', 'khanh@gmail.com', '0987664321'),
('Long', 'long@gmail.com', '0984454321'),('Tú', 'tu@gmail.com', '0980904321');
SHOW TABLES;
SELECT * FROM products;
SELECT * FROM categories;
SELECT * FROM customers;
-- Lấy 5 sản phẩm đắt nhất
SELECT * FROM  products
ORDER BY price DESC 
LIMIT 5;
-- 5 sản phẩm tồn kho thấp nhất còn bán (quantity > 0).
SELECT * FROM products
WHERE quantity > 0
ORDER BY quantity ASC
LIMIT 5;
-- Tìm sản phẩm tên chứa "gaming" không phân biệt hoa thường
SELECT * FROM products
WHERE LOWER(name) LIKE '%gaming%';  -- LOWER() dùng để chuyển chuỗi thành chữ thường.
-- tên bắt đầu bằng "B".
SELECT * FROM products
WHERE name LIKE 'B%';
-- Lấy sản phẩm giá trong khoảng 100k-2tr, sắp giảm dần theo giá.
SELECT * FROM products
WHERE price BETWEEN 100000 AND 2000000
ORDER BY price DESC ;

-- Lấy danh sách giá trị tồn kho từng sản phẩm (price * quantity AS gia_tri_ton), sắp giảm dần.
SELECT name, price * quantity AS gia_tri_ton  -- Đặt tên cho cột kết quả
FROM products
ORDER BY gia_tri_ton DESC ;

-- Tăng giá 10% cho toàn bộ sản phẩm thuộc danh mục id = 2 (UPDATE có tính toán).
UPDATE products SET price = price * 0.1 + price WHERE category_id = 2;

-- Xóa mọi sản phẩm hết hàng (quantity = 0); 
SELECT * FROM products
WHERE quantity = 0;
DELETE FROM products
WHERE quantity = 0;	
-- Insert 1 khách hàng thiếu email (NULL), sau đó tìm mọi khách chưa có email bằng IS NULL.
INSERT INTO customers (name, phone)
VALUES ('Giang', '0997658766'), ('Ánh', '0998658766');
SELECT * FROM customers
WHERE email IS NULL;
-- Lấy danh sách các mức giá không trùng nhau (DISTINCT).
SELECT DISTINCT price FROM products;
-- Dùng IN: lấy sản phẩm thuộc danh mục 1, 3, 5 trong 1 câu lệnh.
SELECT * FROM products 
WHERE category_id IN (1,3,5);
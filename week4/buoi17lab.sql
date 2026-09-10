USE buoi17;
-- Nhập hàng mới
INSERT INTO products (name, price, quantity, category_id)
VALUES ('Tai nghe', 70000,100, 5);
INSERT INTO products (name, price, quantity, category_id)
VALUES ('Iphone 6',1000000, 35, 4);
-- UPDATE cộng quantity
UPDATE products SET quantity = quantity + 10 WHERE id = 53;
UPDATE products SET quantity = quantity +5 WHERE id = 54;
-- đổi giá khuyến mãi cho 1 nhóm sản phẩm
UPDATE products SET price = price - price * 0.1  WHERE category_id = 4;
-- đổi SĐT khách
UPDATE customers SET phone = '0999999999' WHERE id = 12;
-- đổi email khách
UPDATE customers SET email = 't@gmail.com' WHERE id = 11;
-- xóa sản phẩm 
DELETE FROM products 
WHERE id = 41;
-- liệt kê: hàng sắp hết
SELECT * FROM products 
WHERE quantity < 10;
-- giá trị tồn của từng sản phẩm
SELECT name, price * quantity AS gia_tri_ton FROM products;
-- tổng giá trị tồn
SELECT SUM(price * quantity)  AS  tong_gia_tri FROM products;
-- 3 sản phẩm giá trị nhất
SELECT * FROM products  
ORDER BY price DESC 
LIMIT 3;
-- 5 sản phẩm số lượng ít nhất
SELECT * FROM products 
ORDER BY price ASC 
LIMIT 5;
-- tìm sản phẩm trong khoảng giá 1000000 - 10000000
SELECT * FROM products  
WHERE price BETWEEN 1000000 AND 10000000;
-- tìm sản phẩm tên bắt đầu bằng "T"
SELECT * FROM products 
WHERE name LIKE 'B%';
SELECT * FROM products;
SELECT * FROM customers;
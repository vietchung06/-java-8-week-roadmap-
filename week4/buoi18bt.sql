USE buoi17;
ALTER TABLE products
ADD CONSTRAINT fk_product_category
FOREIGN KEY (category_id) REFERENCES categories (id);

ALTER TABLE orders
ADD CONSTRAINT fk_order_customer
FOREIGN KEY (customer_id) REFERENCES customers (id);

INSERT INTO products (name, price, quantity, category_id)
VALUES ('Iphone 8', 500000, 29, 999);-- CSDL tự chặn dữ liệu mồ côi
INSERT INTO products (name, price, quantity )
VALUES ('Iphone 19', 18000000, 20 );
INSERT INTO categories (name)
VALUES ('Phụ kiện');
-- 3.	Liệt kê tên sản phẩm kèm tên danh mục (INNER JOIN).
SELECT p.name, c.name FROM products p 
INNER JOIN categories c 
ON p.category_id = c.id;
-- 4.	Liệt kê TẤT CẢ danh mục kèm sản phẩm nếu có (LEFT JOIN) 
SELECT c.name, p.name, p.price FROM categories c 
LEFT JOIN products p
ON c.id = p.category_id;
-- 5.	Tìm danh mục chưa có sản phẩm nào (LEFT JOIN + IS NULL).
SELECT c.name, p.name, p.price FROM categories c
LEFT JOIN products p
ON c.id = p.category_id
WHERE p.id IS NULL;
SELECT p.name, c.name FROM products p
LEFT JOIN categories c
ON p.category_id = c.id
WHERE c.id IS NULL;
-- 6. liệt kê đơn hàng kèm tên và SĐT khách (JOIN orders-customers).
SELECT o.id, o.order_date, o.order_status, c.name,c.phone FROM orders o 
LEFT JOIN customers c
ON o.customer_id = c.id;
-- 7.	Tìm khách hàng chưa từng đặt đơn nào (LEFT JOIN + IS NULL 
SELECT c.name, o.id, o.order_date, o.order_status FROM customers c 
LEFT JOIN orders o 
ON c.id = o.customer_id
WHERE o.id IS NULL;
-- 8.	JOIN 3 bảng: đơn hàng → khách hàng, và sản phẩm → danh mục (2 câu riêng); thử tự viết 1 câu JOIN 3 bảng bất kỳ có ý nghĩa.
SELECT o.id, p.name, oi.quantity, oi.price_at_purchase FROM orders o
INNER JOIN order_items oi
ON o.id = oi.order_id
INNER JOIN products p
ON p.id = oi.product_id;
-- 9.	Thử xóa 1 danh mục đang có sản phẩm — quan sát lỗi FK;
DELETE FROM categories 
WHERE id = 6;

DESCRIBE products;
DESCRIBE categories;
DESCRIBE orders;
SELECT * FROM products;
SELECT * FROM categories;
SELECT * FROM customers;
SELECT * FROM orders;
SHOW CREATE TABLE orders;



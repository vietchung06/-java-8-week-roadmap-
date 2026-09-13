USE buoi17;
-- 1.	Đếm số sản phẩm theo từng danh mục; chỉ hiện danh mục có trên 2 sản phẩm (HAVING).
SELECT category_id, COUNT(*) FROM products
GROUP BY category_id 
HAVING COUNT(*) > 2;
-- 2.	Tổng doanh thu toàn cửa hàng; doanh thu theo từng danh mục; theo từng khách hàng.
SELECT SUM(price_at_purchase * quantity) AS tong_doanh_thu FROM order_items;

SELECT category_id, SUM(oi.price_at_purchase * oi.quantity) AS danh_thu_theo_category FROM  order_items oi
JOIN products p
ON oi.product_id = p.id
GROUP BY category_id;

SELECT customer_id, SUM(oi.price_at_purchase * quantity) AS danh_thu_theo_customer FROM  order_items oi
JOIN orders o
ON o.id = oi.order_id
GROUP BY o.customer_id;

-- 3.	Đơn hàng có tổng tiền cao nhất (GROUP BY + ORDER BY + LIMIT).
SELECT order_id, SUM(price_at_purchase * quantity)AS  tong_tien FROM order_items 
GROUP BY order_id
ORDER BY tong_tien DESC
LIMIT 1;

-- 4.	Giá trung bình sản phẩm theo từng danh mục; danh mục nào giá trung bình cao nhất.
SELECT category_id, AVG(price) AS gia_tb FROM products
GROUP BY category_id 
ORDER BY gia_tb DESC 
LIMIT 1
;

-- 5.	Top 5 sản phẩm bán chạy nhất theo tổng quantity đã bán.
SELECT product_id , SUM(quantity) AS  tong_quantity FROM order_items 
GROUP BY product_id 
ORDER BY tong_quantity DESC 
LIMIT 5;
SELECT p.id , p.name, SUM(oi.quantity) AS  tong_quantity FROM order_items oi
JOIN products p
ON p.id = oi.product_id
GROUP BY p.id, p.name
ORDER BY tong_quantity DESC
LIMIT 5;

-- 6.	Số đơn hàng theo từng tháng (GROUP BY MONTH(order_date) hoặc DATE_FORMAT).
SELECT  MONTH(order_date) AS thang, COUNT(*) AS so_don_hang FROM  orders 
GROUP BY MONTH(order_date);
SELECT  DATE_FORMAT(order_date, '%y-%m') AS thang, COUNT(*) AS so_don_hang FROM  orders 
GROUP BY DATE_FORMAT(order_date,'%y-%m');

-- 7.	Khách hàng chi tiêu nhiều nhất; khách có trên 2 đơn.
SELECT customer_id , SUM(price_at_purchase * quantity) AS tong_chi_tieu FROM  order_items oi 
JOIN  orders o
ON o.id = oi.order_id
GROUP BY customer_id
ORDER BY tong_chi_tieu DESC 
LIMIT 1;

SELECT customer_id ,COUNT(*) AS so_don FROM orders 
GROUP BY customer_id ;
HAVING COUNT(*) > 2;

-- 8.	Subquery: sản phẩm có giá cao hơn giá trung bình toàn cửa hàng; khách hàng có đơn trong tháng gần nhất.
SELECT * FROM products 
WHERE price > (SELECT AVG(price) FROM products);
SELECT AVG(price) FROM products;

SELECT customer_id, order_date FROM orders
WHERE DATE_FORMAT(order_date, '%Y-%m') = (SELECT DATE_FORMAT(MAX(order_date), '%Y-%m') FROM orders);

-- 9.	Transaction chuyển kho như ví dụ, nhưng giữa chừng cố tình chạy 1 câu lỗi rồi ROLLBACK — 
-- kiểm chứng dữ liệu về nguyên trạng; sau đó chạy lại với COMMIT.
SELECT id , price , quantity FROM products
WHERE id IN (32,33);

START TRANSACTION;
UPDATE products SET quantity = quantity + 5 WHERE id = 32;
UPDATE products SET quantity_sai = quantity_sai -5 WHERE id =33;
ROLLBACK;
START TRANSACTION;
UPDATE products SET quantity = quantity + 5 WHERE id = 32;
UPDATE products SET quantity = quantity - 2 WHERE id =33;
COMMIT;

-- 10.	Viết kịch bản "đặt đơn hàng" thuần SQL trong 1 transaction: 
-- insert orders, insert 2 dòng order_items, update trừ quantity 2 sản phẩm, COMMIT 
START TRANSACTION;
INSERT INTO orders (customer_id, order_date, order_status)
VALUES (4, '2025-9-8', 'Đang giao');
INSERT INTO order_items (order_id, product_id, quantity, price_at_purchase)
VALUES (41, 32, 10,500000 ),(41, 33, 2,500000 );
UPDATE products SET quantity = quantity - 10 WHERE id = 32;
UPDATE products SET quantity =quantity - 2 WHERE id =33;
COMMIT;
SELECT * FROM products;
SELECT * FROM order_items;
SELECT * FROM orders;
SELECT * FROM customers;

USE buoi17;
-- doanh thu theo tháng
SELECT MONTH(o.order_date) AS  thang, SUM(oi.price_at_purchase * oi.quantity) AS doanh_thu FROM orders o
JOIN order_items oi
ON o.id = oi.order_id
GROUP BY MONTH(o.order_date);
-- top 5 sản phẩm bán chạy
SELECT product_id , SUM(quantity) AS tong_so_luong FROM order_items
GROUP BY product_id 
ORDER BY tong_so_luong  DESC 
LIMIT 5;

-- top 5 khách VIP
SELECT o.customer_id, SUM(oi.price_at_purchase * oi.quantity) AS  tong_chi_tieu FROM order_items oi
JOIN orders o
ON o.id = oi.order_id
GROUP BY o.customer_id
ORDER BY tong_chi_tieu DESC 
LIMIT 5;
-- danh mục kèm doanh thu và tỉ trọng
SELECT p.category_id, SUM(oi.price_at_purchase * oi.quantity) AS doanh_thu_danh_muc
-- SUM(oi.price_at_purchase * oi.quantity)/ (SELECT SUM(price_at_purchase * quantity) FROM order_items) * 100 AS ti_trong
FROM order_items oi
JOIN products p
ON p.id = oi.product_id
GROUP BY p.category_id;

-- sản phẩm chưa từng bán được (LEFT JOIN); 
SELECT p.id,p.name, oi.id, oi.quantity,oi.price_at_purchase FROM products p 
LEFT JOIN order_items oi
ON oi.product_id = p.id
WHERE oi.id IS NULL;

-- giá trị tồn kho theo danh mục
SELECT category_id, SUM(price * quantity) AS gia_tri_ton_kho FROM products 
GROUP BY category_id ;

-- đơn hàng trung bình bao nhiêu tiền
SELECT AVG(tong_tien) AS tien_tb 
FROM (SELECT order_id , SUM(quantity * price_at_purchase) AS tong_tien 
FROM order_items GROUP BY order_id) AS don_hang; -- 

-- ; ngày trong tuần nào bán tốt nhất
SELECT DAYOFWEEK(order_date) AS ngay_trong_tuan, COUNT(*) AS so_don FROM orders 
GROUP BY DAYOFWEEK(order_date)
ORDER BY so_don DESC ;

SELECT * FROM products;
SELECT * FROM order_items;
SELECT * FROM orders;
SELECT * FROM customers;
SELECT * FROM categories;

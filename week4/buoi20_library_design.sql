CREATE DATABASE library;
USE library;

CREATE TABLE categories (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL UNIQUE
);
CREATE TABLE books (
id INT PRIMARY KEY AUTO_INCREMENT,
category_id INT NOT NULL,
title VARCHAR(200) NOT NULL,
author VARCHAR(100) NOT NULL,
FOREIGN KEY (category_id) REFERENCES categories(id)
);
CREATE TABLE book_copies (-- Bản scahs bản vật lí
id INT PRIMARY KEY AUTO_INCREMENT,
book_id INT NOT NULL,
copy_code VARCHAR(200) NOT NULL UNIQUE,
status VARCHAR(200) NOT NULL,
FOREIGN KEY (book_id) REFERENCES books(id)
);
CREATE TABLE readers (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100) NOT NULL,
phone VARCHAR(20) NOT NULL UNIQUE,
email VARCHAR(200) UNIQUE
);
CREATE TABLE borrow_slips ( -- phiếu mượn
id INT PRIMARY KEY AUTO_INCREMENT,
reader_id INT NOT NULL,
borrow_date DATE NOT NULL,   -- ngày mượn
due_date DATE NOT NULL,      -- hạn phải trả
return_date DATE ,            -- ngày thực tế trả
FOREIGN KEY (reader_id) REFERENCES readers(id)
);
CREATE TABLE borrow_details ( -- chi tiết phiếu mượn
id INT PRIMARY KEY AUTO_INCREMENT,
borrow_slip_id INT	NOT NULL , --	Thuộc phiếu mượn nào
book_copy_id INT NOT NULL,              -- Bản sách cụ thể được mượn
FOREIGN KEY (borrow_slip_id) REFERENCES borrow_slips(id),
FOREIGN KEY (book_copy_id) REFERENCES book_copies(id)
);

CREATE TABLE fines (
id INT PRIMARY KEY AUTO_INCREMENT,
borrow_slip_id INT NOT NULL,
amount DECIMAL(10,2) NOT NULL,              -- Số tiền phạt
reason VARCHAR(200) NULL,	                  -- Lý do bị phạt
paid  BOOLEAN NOT NULL DEFAULT FALSE  ,        -- Đã thanh toán tiền phạt hay chưa
FOREIGN KEY (borrow_slip_id) REFERENCES borrow_slips(id)
);

INSERT INTO categories (name)
VALUES
('Công nghệ thông tin'),
('Kinh tế'),
('Văn học'),
('Lịch sử'),
('Khoa học'),
('Ngoại ngữ'),
('Kỹ năng sống'),
('Tâm lý học'),
('Giáo dục'),
('Truyện');

INSERT INTO books (category_id, title, author)
VALUES
(1, 'Java Core', 'Nguyễn Văn An'),
(1, 'Lập trình MySQL', 'Trần Văn Bình'),
(2, 'Kinh tế học cơ bản', 'Lê Minh'),
(3, 'Tuổi trẻ đáng giá bao nhiêu', 'Rosie Nguyễn'),
(4, 'Lịch sử Việt Nam', 'Phạm Văn Sơn'),
(5, 'Khám phá khoa học', 'Nguyễn Minh'),
(6, 'English Grammar', 'Raymond Murphy'),
(7, 'Kỹ năng giao tiếp', 'Trần Anh'),
(8, 'Tâm lý học cuộc sống', 'Nguyễn Hoa'),
(10, 'Dế Mèn phiêu lưu ký', 'Tô Hoài');

INSERT INTO book_copies (book_id, copy_code, status)
VALUES
(1, 'JAVA001', 'Đang mượn'),
(1, 'JAVA002', 'Có sẵn'),
(2, 'SQL001', 'Đang mượn'),
(2, 'SQL002', 'Có sẵn'),
(3, 'KT001', 'Đang mượn'),
(4, 'VH001', 'Có sẵn'),
(5, 'LS001', 'Đang mượn'),
(6, 'KH001', 'Có sẵn'),
(7, 'ENG001', 'Đang mượn'),
(10, 'DM001', 'Có sẵn');



INSERT INTO readers (name, phone, email)
VALUES
('Chung', '0911111111', 'chung@gmail.com'),
('Nam', '0922222222', 'nam@gmail.com'),
('Anh', '0933333333', 'anh@gmail.com'),
('Dung', '0944444444', 'dung@gmail.com'),
('Hùng', '0955555555', 'hung@gmail.com'),
('Lan', '0966666666', 'lan@gmail.com'),
('Mai', '0977777777', 'mai@gmail.com'),
('Tuấn', '0988888888', 'tuan@gmail.com'),
('Hà', '0999999999', 'ha@gmail.com'),
('Minh', '0900000000', 'minh@gmail.com');


INSERT INTO borrow_slips
(reader_id, borrow_date, due_date, return_date)
VALUES
(1, '2026-09-01', '2026-09-10', NULL),
(2, '2026-09-02', '2026-09-11', '2026-09-08'),
(3, '2026-09-03', '2026-09-12', NULL),
(4, '2026-09-04', '2026-09-13', '2026-09-15'),
(5, '2026-09-05', '2026-09-14', NULL),
(6, '2026-09-06', '2026-09-15', '2026-09-10'),
(7, '2026-09-07', '2026-09-16', NULL),
(8, '2026-09-08', '2026-09-17', '2026-09-12'),
(9, '2026-09-09', '2026-09-18', NULL),
(10, '2026-09-10', '2026-09-19', '2026-09-11');


INSERT INTO borrow_details
(borrow_slip_id, book_copy_id)
VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);


INSERT INTO fines
(borrow_slip_id, amount, reason, paid)
VALUES
(1, 50000, 'Trả sách quá hạn', FALSE),
(2, 0, NULL, TRUE),
(3, 30000, 'Trả sách quá hạn', FALSE),
(4, 20000, 'Trả sách quá hạn', TRUE),
(5, 40000, 'Trả sách quá hạn', FALSE),
(6, 0, NULL, TRUE),
(7, 60000, 'Trả sách quá hạn', FALSE),
(8, 0, NULL, TRUE),
(9, 25000, 'Trả sách quá hạn', FALSE),
(10, 0, NULL, TRUE);

-- sách đang được mượn
SELECT b.title, bc.copy_code,bc.status FROM book_copies bc
JOIN books b
ON b.id = bc.book_id
WHERE bc.status = 'Đang mượn';
-- độc giả mượn quá hạn
SELECT r.name, b.title, bs.borrow_date, bs.due_date FROM borrow_slips bs
JOIN borrow_details bd
ON bd.borrow_slip_id = bs.id
JOIN book_copies bc 
ON bc.id = bd.book_copy_id
JOIN books b
ON b.id = bc.book_id
JOIN readers r
ON r.id = bs.reader_id
WHERE bs.due_date < CURDATE();
AND bs.return_date IS NULL;

-- sách hot nhất tháng
SELECT b.title,COUNT(*) AS so_sach_muon FROM borrow_details bd
JOIN book_copies bc
ON bc.id = bd.book_copy_id
JOIN books b  
ON b.id = bc.book_id
GROUP BY b.title
ORDER BY so_sach_muon DESC ;
li;


SELECT * FROM categories;
SELECT * FROM books;
SELECT * FROM readers;
SELECT * FROM borrow_slips;
SELECT * FROM borrow_details;
SELECT * FROM book_copies;
SELECT * FROM fines;
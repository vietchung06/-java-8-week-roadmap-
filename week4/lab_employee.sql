CREATE DATABASE  Employee;
USE Employee;
 CREATE TABLE employees (
 id INT PRIMARY KEY AUTO_INCREMENT,
 full_name VARCHAR(200) NOT NULL,
 email VARCHAR(200) UNIQUE,
 salary DECIMAL(10,2),
 department VARCHAR(100)
);
INSERT INTO employees (full_name, email, salary, department)
VALUES
('Nguyen Van An', 'an@gmail.com', 15000000, 'IT'),
('Tran Van Binh', 'binh@gmail.com', 20000000, 'IT'),
('Le Thi Hoa', 'hoa@gmail.com', 12000000, 'HR'),
('Pham Van Nam', 'nam@gmail.com', 18000000, 'HR'),
('Do Van Minh', 'minh@gmail.com', 25000000, 'Finance');
SELECT * FROM employees;
--  nhân viên lương cao nhất từng phòng ban
SELECT e.* FROM employees e
JOIN (
    SELECT department, MAX(salary) AS max_salary
    FROM employees
    GROUP BY department
) m
ON e.department = m.department
AND e.salary = m.max_salary;

-- phòng ban có quỹ lương lớn nhất
SELECT department, SUM(salary) AS quy_luong FROM employees
GROUP BY department 
ORDER BY quy_luong DESC 
LIMIT 1;

-- nhân viên lương trên trung bình toàn công ty
SELECT e.* FROM employees e
WHERE salary > (SELECT AVG(salary) AS luong_tb FROM employees);


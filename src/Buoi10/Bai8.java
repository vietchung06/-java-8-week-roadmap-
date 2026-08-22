package Buoi10;

public class Bai8 {
}
/*
 *
 *  Tiêu chí          | Abstract class              | Interface
 * ------------------------------------------------------------
 *  Constructor       | Có constructor             | Không có constructor
 *
 *  Field thường      | Có thể có field thường     | Không có field
 *                    | (instance variable)        |
 *
 *  Method            | Có abstract method         | Có abstract method
 *                    | và method thường
 *
 *  Số lượng cha      | Một class chỉ extends      | Một class có thể
 *                    | được 1 abstract class     | implements nhiều interface
 *
 *  Từ khóa           | extends                    | implements
 *
 *  Khi nào dùng?     | Khi các class có quan hệ  | Khi các class cần
 *                    | "là một" và có chung      | có chung một khả năng
 *                    | thuộc tính + hành vi      | hoặc một hợp đồng
 *
 *  Ví dụ             | Animal -> Dog, Cat        | Flyable -> Bird, Plane
 *
 * ============================================================
 */

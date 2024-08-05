package vn.com.t3h.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.t3h.entity.UserEntity;

/**
 là interface được kế thừa từ JpaRepository
 - khi khai báo UserRepository và cho kế thừa từ JpaRepository<UserEntity, Long>
    + thì tương đương interface này đóng vai trò là một interface cung cấp các
    method xử lý và kết nối với database
    + interface JpaRepository đã cung cấp sẵn tất cả các hàm cơ bản để làm việc với database
        như
        getOne : lấy ra data theo id
        getById: lấy ra data trong databse theo id
        findAll: lấy ra tất cả dữ liệu trong table
        saveAll: lưu tất cả list vào dabaatase
        save: lưu dữ liệu vào database
        .... và rất nhiều hàm khác
    mà UserRepository đang kế thừa từ JpaRepository => UserRepository sẽ tự động có tất cả các hàm truy vấn với database của
    interface cha
 JpaRepository<T, ID> :
    T: Entity mapping giữa database và app Java
    ID: kiểu dữ liệu của cột ID trong Entity của Java
 vd: JpaRepository<UserEntity, Long>
    UserEntity: là entity của Java
    Long: Là kiểu dữ liệu của trường id trong entity UserEntity
 - Quy trình để kết nối app Java với database sử dụng JDBC khi chưa có Spring data JPA
    b1) tạo kết nối đến database
    b2) tạo ra câu query để truy vấn dữ liệu vd: select * from user_roles;
    b3) Sử dụng thư viện JDBC thư thi câu query select * from user_roles; vào trong database
        và nhận được dữ liệu dưới dạng table trong database
    b4) Chuyển dữ liệu dạng table trong database sang thành dạng class của java
    mục tiêu cuối cùng nhận về dữ liệu database đã được chuyển thành các object java

 */
@Repository // để spring boot hiểu đây là interface repository và tự động tạo và quản lý bean
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

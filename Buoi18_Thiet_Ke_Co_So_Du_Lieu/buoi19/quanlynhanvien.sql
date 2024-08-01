
create database quanlynhanvien;
use quanlynhanvien;

create table nhan_vien(
                          id bigint primary key auto_increment,
                          ma_nhan_vien varchar(50),
                          ho_ten nvarchar(100),
                          ngay_sinh date,
                          dia_chi nvarchar(200),
                          chuc_vu nvarchar(200),
                          phong_ban_id bigint -- sử dụng để làm khóa ngoại tham chiều tới id bảng phòng ban
);

create table phong_ban(
                          id bigint primary key auto_increment,
                          ma_phong_ban varchar(50),
                          ten_phong_ban nvarchar(100)
);

-- thể hiện mối quan hệ 1 phòng ban chứa nhiều nhân viên(1-n)
alter table nhan_vien add constraint foreign key fk_nv_pb
    (phong_ban_id) references phong_ban(id);

create table du_an(
                      id bigint primary key auto_increment,
                      ma_du_an varchar(50),
                      ten_du_an nvarchar(200)
);

-- Để thể hiện mối quan hệ nhiều - nhiều (n-n) chúng ta sẽ thực hiện
-- tạo ra một bảng trung gian, trong bảng đó sẽ lưu trữ id của hai bảng cần thể hiện mối quan hệ n-n gọi là id_a, id_b
-- trong đó id_a sẽ là khóa phụ tham chiếu tới id của bảng a, id_b sẽ là khóa phụ tham chiều tới id của bảng b
# kết luận: trong bài toán này sẽ tạo ra bảng trung gian nhan_vien_du_an, trong đó sẽ có hai cột id
# id_nhan_vien : tham chiếu tới cột id của bảng nhân viên , id_du_an: tham chiếu tới cột id của bảng dự án
create table nhan_vien_du_an(
                                id bigint primary key auto_increment,
                                id_nhan_vien bigint,
                                id_du_an bigint,
                                foreign key (id_nhan_vien) references nhan_vien(id),
                                foreign key (id_du_an) references du_an(id)
);
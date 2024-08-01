

-- Nhom cau lenh  cơ sở dữ liệu
-- tao co so du lieu CƠ SỞ DỮ LIỆU HÀNG KHÔNG
create database quanlyhangkhong;

-- chỉ định database muốn thao tác use ten_database;
use quanlyhangkhong;

-- Các câu lệnh liên quan đến bảng dữ liệu
    -- 1)  Tạo bảng NHANVIEN(MaNV, Ten, Luong) mô tả thông tin về nhân viên phi hành ñoàn gồm phi công và
        -- tiếp viên. Mỗi nhân viên có một mã số duy nhất, tên và mức lương.
use quanlyhangkhong;
create table NHANVIEN(
                         MaNV CHAR(20) primary key auto_increment, -- đặt tên cột là MaNV, kiểu dữ liệu CHAR lưu trữ max 20 lý tự,
                         #         primary key: đặt cột MaNV là khóa chính, đảm bảo tất cả các dữ liệu cột MaNV không được trùng nhau, \
                         #                       hay không có hai nhân viên nào bị trùng mã nhân viên
                         ten nvarchar(50), -- tên cột cột là tên, với kiểu dữ liệu nvarchar, số ký tự có thể lưu là 50 ký tự, cho phép lưu tiếng việt(utf8)
    luong float -- name colum: luong, data type: float
    );

-- 2) Update table
alter table NHANVIEN
    modify column luong char; -- update datatype colum luong from float to char

alter table NHANVIEN
    add column age int; -- add colum age to table NHANVIEN

-- 3) Delete table
drop table NHANVIEN; -- delete table NHANVIEN

# Nhóm câu lệnh thao tác với dữ liệu của bảng
# 1) add data to table
     insert into NHANVIEN(manv, ten, luong) value ('A001','Nguyễn Đắc Kiên',10000);
insert into NHANVIEN(manv, ten, luong) value ('B001','Le Van Tuan',20000);
insert into NHANVIEN(manv, ten, luong) value ('C001','Le Văn Thành',30000);
insert into NHANVIEN(manv, ten, luong) value ('D001','Nguyễn Văn Hinh',30000);
#    syntax       name_table(colum...)          (value each column)

# 2) update data in table
update NHANVIEN set luong = 2000,MaNV='N002' where ten='Nguyễn Đắc Kiên';
-- update data luong to 2000 and MaNV to 'N002' with ten = 'Nguyễn Đắc Kiên'
# 3) Xóa bản ghi trong table
delete from NHANVIEN where ten='Nguyễn Đắc Kiên';

# Nhóm câu lệnh truy vấn lấy dữ liệu ra từ bảng
# 1) Select: lấy dữ liệu của bảng
select * from NHANVIEN; -- lấy toàn bộ dữ liệu trong bảng nhân viên bao gồm
# tất cả các cột, tất cả các cột dữ liệu của bảng nhân viên
select ten, luong from NHANVIEN;
# Chỉ lấy ra dữ liệu của cột tên, luong trong bảng NHANVIEN

# 2) Select và mệnh đề where sử dụng để lọc dữ liệu dứa trên điều kiện
select * from nhanvien where ten = 'Le Van Tuan';
# lấy ra tất cả thông tin của các cột và các bản ghi có dữ liệu của cột tên = 'Le Van Tuan';

# 3) AND, OR, NOT: Sử dụng để kết hợp nhiều điều kiện trong câu lệnh WHERE.
select * from nhanvien where luong = 10000 OR luong = 20000;
# lấy ra tất cả các bản ghi có dữ liệu của cột lương = 10000 hoặc lương = 20000

select * from nhanvien where luong = 10000 OR luong = 20000 and MaNV = 'A001';
# lấy ra tất cả các bản ghi có dữ liệu của cột lương = 10000 hoặc lương = 20000 và mã nhân viên = 'A001'

# 4) ORDER BY: Sắp xếp kết quả trả về. DESC: giảm dần, ASC: tăng dần
select * from nhanvien order by luong  DESC;
# lấy ra tất cả dữ liệu bảng nhân viên, sắp xếp giảm dần theo dữ liệu của cột lương

# 5) GROUP BY: Nhóm dữ liệu dựa trên một hoặc nhiều cột.
select luong,count(*) from nhanvien group by luong;
# nhóm tất cả các bản ghi có cùng dữ liệu lương, và đếm số lượng bản ghi ở mỗi loại

# 6) Toán tử tìm kiếm like, like là toán tử tìm kiếm chuỗi gần đúng, nếu đặt % phía trước like => tất cả các ký tự đằng trước sẽ được bỏ qua
select * from nhanvien;
# viết câu lệnh tìm kiếm nhân viên có họ Nguyễn trong tên
select * from nhanvien where ten like 'Nguyễn%';
# viết câu lệnh tìm kiếm tất cả nhân viên có họ đệm là Văn
select * from nhanvien where ten like '%Văn%';

# 6) toán tử NOT được sử dụng để phủ định một điều kiện
# viết câu lệnh tìm kiếm nhân viên không có họ Nguyễn trong tên
select * from nhanvien where ten not like 'Nguyễn%';
# lấy ra tất cả các bản ghi có dữ liệu của cột lương không = 10000 và lương không = 20000
select * from nhanvien where not(luong = 10000) And not (luong = 20000);

# 7) Toán tử In được sử dụng để xác định xem một giá trị có tồn tại trong một danh sách các giá trị hay không
select * from nhanvien;
# tìm kiếm tất cả các nhân viên có mã nhân viên thuộc danh sách (A001,B001,C001), toán tử in thường được dung khi muốn tìm data
# với dữ liệu truyền vào lớn
select * from nhanvien where MaNV in ('A001','B001','C001');
# tìm kiếm tất cả các nhân viên có mã nhân viên không thuộc danh sách (A001,B001,C001),
select * from nhanvien where MaNV not in ('A001','B001','C001');

create database quanlynhanvien;
use quanlynhanvien;
create table nhan_vien(
                          id bigint primary key auto_increment,
                          ma_nv char(20),
                          ten_nv nvarchar(100),
                          tuoi int
);
create table hop_dong(
                         id bigint primary key auto_increment,
                         ma_hd char(30),
                         ten_hd nvarchar(50),
                         ngay_hl date ,
                         luong float,
                         nhan_vien_id bigint #
);
alter table hop_dong add constraint fk_nhanvien
    foreign key (nhan_vien_id) references nhan_vien(id);
-- diagram là hình mình họa trực quan giữa hai table

-- thêm dữ dữ liệu bảng được tham chiếu( bảng nhân viên) trước, rồi sau đó mới thêm dữ liệu của bảng hop_dong
-- vì khi thêm dữ liệu của bảng hợp đồng sẽ có cột nhan_vien_id bắt buộc phải lấy đúng giá trị ở cột id tại bảng nhan_vien
-- nếu sai giá trị, câu lệnh sẽ không chạy được, và không đảm bảo tính toàn vẹn dữ liệu
insert into nhan_vien(ma_nv, ten_nv, tuoi) values
    ('M007','Nguyễn Văn Đô', 27);

insert into hop_dong(ma_hd, ten_hd, ngay_hl, luong, nhan_vien_id) values
                                                                      ('HD001', 'Hợp đồng lao động', '2023-01-15', 1500.00, 1),
                                                                      ('HD002', 'Hợp đồng thử việc', '2023-02-01', 1000.00, 2),
                                                                      ('HD003', 'Hợp đồng lao động', '2023-03-10', 1800.00, 3),
                                                                      ('HD004', 'Hợp đồng thực tập', '2023-04-20', 800.00, 4),
                                                                      ('HD005', 'Hợp đồng lao động', '2023-05-25', 2000.00, 5);

select * from nhan_vien;
select * from hop_dong;

# lấy ra thông tin nhân viên và hợp đồng của nhân viên có tên
# Lê Công Vinh

select * from nhan_vien;
select * from hop_dong;
# dữ liệu hiện tại, trong bảng nhân viên có 6 nhân viên, trong bảng hợp
# đồng có 4 hợp đồng, vậy kết luận khi sử dụng lệnh inner join sẽ chỉ lấy ra
# được 4 bản ghi có dữ liệu bằng nhau tại cột id của bảng nhan_vien và
# cột nhan_vien_id của bảng hop_dong

select * from nhan_vien inner join hop_dong
                                   on nhan_vien.id = hop_dong.nhan_vien_id;
-- chỉ lấy ra các nhân viên của bảng nhien_vien và bảng hop_dong
-- khi hai bảng đấy có dữ liệu ở cột id tại bảng nhan_vien trùng
-- với cột hop_dong tại bảng nhan_vien_id

-- ví dụ left join
# dữ liệu hiện tại, trong bảng nhân viên có 6 nhân viên, trong bảng hợp
# đồng có 4 hợp đồng, vậy kết luận khi sử dụng lệnh left join cho bảng nhan_vien
# và bảng hop_dong => sẽ lấy toàn bộ table1 = nhan_vien, table2 = hop_dong
# vậy sẽ lấy ra toàn bộ dữ liệu của bảng nhân viên (6) bản ghi, kết hợp với
# 4 bản ghi thỏa mãn điều kiện của bảng hop_dong

select * from nhan_vien left join hop_dong hd on nhan_vien.id = hd.nhan_vien_id;
# lấy ra tất cả bản ghi trong bảng nhan_vien và kết hợp với 4 bản ghi thỏa
# mãn tại bảng hop_dong

-- ví dụ right join
# dữ liệu hiện tại, trong bảng nhân viên có 6 nhân viên, trong bảng hợp
# đồng có 4 hợp đồng, vậy kết luận khi sử dụng lệnh right join cho bảng table1=nhan_vien
# và bảng tablr2=hop_dong
# vậy sẽ lấy ra toàn bộ dữ liệu của bảng hợp đồng(4) bản ghi và chỉ kết hợp với
# các bản ghi tại bảng nhan_vien thỏa mãn điều kiện
select * from nhan_vien right join hop_dong on nhan_vien.id = hop_dong.id;


select * from nhan_vien cross join hop_dong hd;









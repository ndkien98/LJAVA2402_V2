-- c1
-- tao database
create database quanlyhocsinh;

use quanlyhocsinh; -- chỉ sử dụng được với database, để chỉ
-- định cho database chúng ta muốn dùng database nào

create table students (
    student_id int primary key auto_increment,
    name nvarchar(100),
    age int,
    major varchar(50)
);

create table courses (
     course_id int primary key auto_increment,
     course_name nvarchar(100),
     credits int
);

insert into students (name, age, major)
values ('Nguyễn Tuấn Anh',21,'Web develop') ,
       ('Nguyễn Văn Hưng',22,'Data analyst') ,
       ('Lê Thiên Tuấn',23,'Software Engineer');

insert into courses (course_name, credits)
values ('Trí tuệ nhân tạo',3),
       ('Lập trình Java',3),
       ('Thiết kế giao diện',2);

-- Bai 2
alter table students add column email varchar(100);
alter table students change major department varchar(100);

-- giải pháp là thay vì thêm cột trực tiếp, sẽ thêm bảng mới, thêm cột đấy
-- và liên kết bảng mới với bảng đã có
create table students_detail (
    id int primary key auto_increment,
    email varchar(100),
    student_id int,
    foreign key (student_id) references students(student_id)
);

-- Bai 3
insert into students (name, age, department)
values ('Nguyễn Văn Dần',21,'Web develop');

update students set age=26 where name='Nguyễn Văn Dần';

-- Bai 4
create table enrollments(
    enrollment_id int primary key auto_increment,
    student_id int,
    course_id int,
    enrollment_date date,
    foreign key (student_id) references students(student_id),
    foreign key (course_id) references courses(course_id)
);

select * from courses;
select * from students;
insert into enrollments(student_id, course_id, enrollment_date)
values (1,1,now()) ,
       (2,2,now()) ,
       (3,3,now()) ,
       (4,1,now());
select * from enrollments;
-- Bai 5
-- 1.	Truy vấn tất cả các sinh viên trong bảng students.
select * from students;
-- 2.	Truy vấn tất cả các khóa học trong bảng courses.
select * from courses;
-- 3. Truy vấn danh sách các sinh viên đã đăng ký một khóa học cụ thể.
-- định nghĩa thế nào là một sinh viên đã đăng ký khóa học cụ thể ?
# câu trả lời: sinh viên đã đăng ký một khóa học nào đó, có thể là khóa học
# có id = 1 hoặc 2,3 thì đó là các sinh viên đã đăng ký một khóa học cụ thể
# bảng enrollments là bảng trung gian bảng student và courses để xác định xem
# sinh viên nào đăng ký môn học nào
# lời giải: kết hợp dữ liệu của bảng students và bảng enrollments
# nếu có thể ra được dữ liệu => đó chính là các sinh viên đã đăng ký một môn
# học cụ thể => sử dụng lệnh inner join giữa hai bảng students và enrollments

# table student: lưu trữ danh sách các học sinh
# table courses: lưu trữ danh sách các khóa học
# bản chất của phần mềm quản lý học sinh là phải biết và quản lý được
# 1: có bao nhiêu học sinh : bảng student đã lưu
# 2: có bao nhiêu khóa học : bảng courses đã lưu
# 3: các học sinh đang học những khóa học nào
#   enrollments đang đóng vai trò lưu lại sinh A đang học khóa học nào
# ví dụ: sinh viên Nguyễn Văn Dần đang học khóa học Trí tuệ nhân tạo
# => trong bảng enrollments sẽ lưu trữ cột student_id = id của Nguyễn Văn Dần
# => trong bảng enrollments sẽ lưu trữ cột course_id = id của của khóa học
# cho lên khi muốn biết danh sách các sinh viên đã đăng ký một khóa học cụ thể. => chỉ cần kết hợp dữ liệu của bảng student và
# bảng enrollments => là có thể biết

# ví dụ: muốn lấy ra khóa học mà học sinh Nguyễn Văn Dần đang học

select * from students where name='Nguyễn Văn Dần'; -- b1) tìm ra sinh viên nguyễn văn dần lấy được id của sinh viên đấy(student_id = 4)
select * from enrollments where student_id = 4; -- tìm ra được id của khóa học mà dần đang học = 1 ( course_id = 1)
select * from courses where course_id = 1; -- từ id khóa học ở trên tìm ra được khóa học dần đang học

# tối ưu kết hợp 3 câu query lại thành 1 câu query duy nhất để tìm ra được khóa học mà Nguyễn Văn Dần đang học
# 3 câu query ở trên đang kết hợp dữ liệu của 3 bảng    students, enrollments, courses để tìm ra được khóa học mà Nguyễn Văn Dần đang học
# sử dụng lệnh inner join kết hợp dữ liệu của cả 3 bảng với nhau để thay cho 3 câu query
# inner join: kết hợp dữ liệu của hai bảng và chỉ lấy ra các dữ liệu thỏa mãn điều kiện sau toán tử ON
select course_id from students inner join enrollments
ON students.student_id = enrollments.student_id
where students.name= 'Nguyễn Văn Dần'; -- lấy ra được id của khóa học =>

select * from courses where course_id = 1;
# -------- câu kết quy nhất 1 câu query để tìm ra đáp án
select students.name,courses.course_name from students
    inner join enrollments ON students.student_id = enrollments.student_id -- để tìm ra course_id
    inner join courses ON courses.course_id = enrollments.course_id -- tìm ra thông tin của khóa học
where students.name= 'Nguyễn Văn Dần'; -- tìm ra sinh viên Nguyễn Văn Dần có id là gì để mang id join với các bảng khác

-- 3. Truy vấn danh sách các sinh viên đã đăng ký một khóa học cụ thể.
-- định nghĩa thế nào là một sinh viên đã đăng ký khóa học cụ thể ?
-- câu trả lời chính là sinh viên đấy đã có dữ liệu ở trong bảng enrollments, vì bảng enrollments là bảng trung gian
-- ghi lại các sinh viên nào đăng ký khóa học gì
insert into students (name, age, department)
values ('Nguyễn Văn A',21,'Web develop'); -- không có id student_id trong bảng enrollments => Nguyễn Văn A chưa đăng ký kháo học nào
select * from students;
select * from enrollments; -- phục vụ mụcd đích gì: lưu trữ thông tin sinh viên đã đăng ký các khóa học gì
select * from courses;
select students.name from students inner join enrollments e on students.student_id = e.student_id;

-- c5: Đếm số lượng sinh viên trong mỗi ngành học (department) trong bảng students.
select students.department,count(*) from students group by students.department;

-- Bai 6
-- c1: Tìm sinh viên có tuổi lớn nhất trong bảng students.
select * from students where age = (select max(age) from students);

-- c2: Tìm khóa học có số tín chỉ nhiều nhất trong bảng courses.
select * from courses where credits = (select max(credits) from courses);

-- c3 Truy vấn danh sách sinh viên cùng với các khóa học họ đã đăng ký (sử dụng JOIN).
select name,c.course_name from students
    inner join enrollments e on students.student_id = e.student_id
    inner join courses c on e.course_id = c.course_id;



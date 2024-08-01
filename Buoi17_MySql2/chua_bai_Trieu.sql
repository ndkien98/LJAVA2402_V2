-- Bai 1
# create database students;  không được đặt tên database trùng với tên table lên đặt là manager_students
create database manager_students;
use manager_students; -- sử dụng với tên db để chỉnh định database muốn dùng
create table students(
                         student_id int primary key  auto_increment,
                         name varchar(50),
                         age int,
                         major varchar(50)
);
create table courses(
                        course_id int primary key  auto_increment,
                        course_name varchar(50),
                        credits int

);
# use students; -- sai chỗ này
insert into students(name,age,major) values
                                        ('Nguyen Van A',20,'cntt'),
                                        ('Nguyen Van B',23,'ke toan'),
                                        ('Nguyen van c',21,'tri tue nhan tao ');
select * from students;

# use courses sai chỗ này, từ khóa use chỉ dùng với tên database không được dùng với bảng
insert into  courses(course_name,credits) values
                                             ('Nhap Mon Hoc May',5),
                                             ('Tri tue nhan tao',5),
                                             ('Lap Trinh Web',3);
select * from courses;

-- Bai 2;
-- them bang mail
# use students; chỗ này thay bằng câu lệnh use manager_students;
use manager_students;
ALTER TABLE  students
    ADD column email VARCHAR(100);
select *from students;
-- doi ten cot
# use students;
ALTER TABLE  students
    CHANGE  column major department varchar(50);
select * from students;
-- them sinh vien
insert into students(name,age,department)values
    ('Nguyen van d',21,'web nang cao  ');
select * from students;
-- xoa sinh vien voi id
DELETE from students where student_id=5;
select *from students;
-- cap nhat tuoi theo id
update students
set age=39
where name='Nguyen Van B';

select *from students;

-- bai 4
# create database enrollments  ; tạo table mới chứ ko phải database mới, vẫn tạo table enrollments mới trên database cũ
# use enrollments;
# use students; sai
# use courses; sai
create table enrollments(
                            enrollment_id int primary key auto_increment,
                            student_id int ,
                            course_id int ,
                            enrollment_date date,
                            foreign key (student_id)references students(student_id),
                            foreign key (course_id)references courses(course_id)
);

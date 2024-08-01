
create database plane;

use plane;
create table CHUYENBAY(
    MaCB CHAR(5) PRIMARY KEY,
    GaDi varchar(50),
    GaDen varchar(50),
    DoDai int,
    GioDi time,
    GioDen time,
    ChiPhi int
);

select * from plane.chuyenbay;

-- chen du lieu CHUYENBAY
insert into CHUYENBAY values ('VN431','SGN','CAH',3693,'05:55:00','06:55:00',236);
insert into CHUYENBAY values ('VN320','SGN','DAD',2798,'06:00:00','07:10:00',221);
insert into CHUYENBAY values ('VN464','SGN','DLI',2002,'07:20:00','08:05:00',225);
insert into CHUYENBAY values ('VN216','SGN','DIN',4170,'10:30:00','14:20:00',262);
insert into CHUYENBAY values ('VN280','SGN','HPH',11979,'06:00:00','08:00:00',1279);
insert into CHUYENBAY values ('VN254','SGN','HUI',8765,'18:40:00','20:00:00',781);
insert into CHUYENBAY values ('VN338','SGN','BMV',4081,'15:25:00','16:25:00',375);
insert into CHUYENBAY values ('VN440','SGN','BMV',4081,'18:30:00','19:30:00',426);
insert into CHUYENBAY values ('VN651','DAD','SGN',2798,'19:30:00','08:00:00',221);
insert into CHUYENBAY values ('VN276','DAD','CXR',1283,'09:00:00','12:00:00',203);
insert into CHUYENBAY values ('VN374','HAN','VII',510,'11:40:00','13:25:00',120);
insert into CHUYENBAY values ('VN375','VII','CXR',752,'14:15:00','16:00:00',181);
insert into CHUYENBAY values ('VN269','HAN','CXR',1262,'14:10:00','15:50:00',202);
insert into CHUYENBAY values ('VN315','HAN','DAD',134,'11:45:00','13:00:00',112);
insert into CHUYENBAY values ('VN317','HAN','UIH',827,'15:00:00','16:15:00',190);
insert into CHUYENBAY values ('VN741','HAN','PXU',395,'06:30:00','08:30:00',120);
insert into CHUYENBAY values ('VN474','PXU','PQC',1586,'08:40:00','11:20:00',102);
insert into CHUYENBAY values ('VN476','UIH','PQC',485,'09:15:00','11:50:00',117);

use plane;
create table MAYBAY(
    MaMB int primary key ,
    Loai varchar(50),
    TamBay int
    );

insert into MAYBAY values (747,'Boeing 747 - 400',13488);
insert into MAYBAY values (737,'Boeing 737 - 800',5413);
insert into MAYBAY values (380,'Airbus A380 - 500',15000);
insert into MAYBAY values (340,'Airbus A340 - 300',11392);
insert into MAYBAY values (757,'Boeing 757 - 300',6416);
insert into MAYBAY values (777,'Boeing 777 - 300',10306);
insert into MAYBAY values (767,'Boeing 767 - 400ER',10360);
insert into MAYBAY values (320,'Airbus A320',4168);
insert into MAYBAY values (319,'Airbus A319',2888);
insert into MAYBAY values (727,'Boeing 727',2406);
insert into MAYBAY values (154,'Tupolev 154',6565);

create table NHANVIEN(
    MaNV char(9) primary key ,
    Ten varchar(50),
    Luong int
);

-- chen du lieu NHANVIEN
insert into NHANVIEN values ('242518965','Tran Van Son',120433);
insert into NHANVIEN values ('141582651','Doan Thi Mai',178345);
insert into NHANVIEN values ('011564812','Ton Van Quy',153972);
insert into NHANVIEN values ('567354612','Quan Cam Ly',256481);
insert into NHANVIEN values ('552455318','La Que',101745);
insert into NHANVIEN values ('550156548','Nguyen Thi Cam',205187);
insert into NHANVIEN values ('390487451','Le Van Luat',212156);
insert into NHANVIEN values ('274878974','Mai Quoc Minh',99890);
insert into NHANVIEN values ('254099823','Nguyen Thi Quynh',24450);
insert into NHANVIEN values ('356187925','Nguyen Vinh Bao',44740);
insert into NHANVIEN values ('355548984','Tran Thi Hoai An',212156);
insert into NHANVIEN values ('310454876','Ta Van Do',212156);
insert into NHANVIEN values ('489456522','Nguyen Thi Quy Linh',127984);
insert into NHANVIEN values ('489221823','Bui Quoc Chinh',23980);
insert into NHANVIEN values ('548977562','Le Van Quy',84476);
insert into NHANVIEN values ('310454877','Tran Van Hao',33546);
insert into NHANVIEN values ('142519864','Nguyen Thi Xuan Dao',227489);
insert into NHANVIEN values ('269734834','Truong Tuan Anh',289950);
insert into NHANVIEN values ('287321212','Duong Van Minh',48090);
insert into NHANVIEN values ('552455348','Bui Thi Dung',92013);
insert into NHANVIEN values ('248965255','Tran Thi Ba',43723);
insert into NHANVIEN values ('159542516','Le Van Ky',48250);
insert into NHANVIEN values ('348121549','Nguyen Van Thanh',32899);
insert into NHANVIEN values ('574489457','Bui Van Lap',20);

create table CHUNGNHAN(
    MaNV char(9),
    MaMB int ,
    FOREIGN KEY (MaMB) references MAYBAY (MaMB)
);

alter table CHUNGNHAN add foreign key (MaNV) references NHANVIEN (MaNV);

-- chen du lieu CHUNGNHAN
insert into CHUNGNHAN values ('567354612',747);
insert into CHUNGNHAN values ('567354612',737);
insert into CHUNGNHAN values ('567354612',757);
insert into CHUNGNHAN values ('567354612',777);
insert into CHUNGNHAN values ('567354612',767);
insert into CHUNGNHAN values ('567354612',727);
insert into CHUNGNHAN values ('567354612',340);
insert into CHUNGNHAN values ('552455318',737);
insert into CHUNGNHAN values ('552455318',319);
insert into CHUNGNHAN values ('552455318',747);
insert into CHUNGNHAN values ('552455318',767);
insert into CHUNGNHAN values ('390487451',340);
insert into CHUNGNHAN values ('390487451',320);
insert into CHUNGNHAN values ('390487451',319);
insert into CHUNGNHAN values ('274878974',757);
insert into CHUNGNHAN values ('274878974',767);
insert into CHUNGNHAN values ('355548984',154);
insert into CHUNGNHAN values ('310454876',154);
insert into CHUNGNHAN values ('142519864',747);
insert into CHUNGNHAN values ('142519864',757);
insert into CHUNGNHAN values ('142519864',777);
insert into CHUNGNHAN values ('142519864',767);
insert into CHUNGNHAN values ('142519864',737);
insert into CHUNGNHAN values ('142519864',340);
insert into CHUNGNHAN values ('142519864',320);
insert into CHUNGNHAN values ('269734834',747);
insert into CHUNGNHAN values ('269734834',737);
insert into CHUNGNHAN values ('269734834',340);
insert into CHUNGNHAN values ('269734834',757);
insert into CHUNGNHAN values ('269734834',777);
insert into CHUNGNHAN values ('269734834',767);
insert into CHUNGNHAN values ('269734834',320);
insert into CHUNGNHAN values ('269734834',319);
insert into CHUNGNHAN values ('269734834',727);
insert into CHUNGNHAN values ('269734834',154);
insert into CHUNGNHAN values ('242518965',737);
insert into CHUNGNHAN values ('242518965',757);
insert into CHUNGNHAN values ('141582651',737);
insert into CHUNGNHAN values ('141582651',757);
insert into CHUNGNHAN values ('141582651',767);
insert into CHUNGNHAN values ('011564812',737);
insert into CHUNGNHAN values ('011564812',757);
insert into CHUNGNHAN values ('574489457',154);

select * from MAYBAY where Loai = 'Boeing 727' ;
-- =, <>, <,>,<=,>=

select * from CHUNGNHAN where MaNV > 10;

-- like
select * from MAYBAY where Loai like 'Airbus%';
select * from MAYBAY where Loai like '%Bo%' or TamBay > 6000;

-- and: tất cả các điều kiện đều phải trả về true
-- or: một trong tất cả điều kiện trả về true

-- tìm kiếm tất cả máy bay với danh sách các mã máy bay 727,380,747
select * from MAYBAY where MaMB = '727';
select * from MAYBAY where MaMB = '380';
select * from MAYBAY where MaMB = '747';

select * from MAYBAY where MaMB in ('727','380','747');

select * from MAYBAY where MaMB not in ('727','380','747');

select * from CHUYENBAY;
-- hiển thị danh sách chuyển bay, phân trang
-- limit, offset:
-- limit: giới hạn số lượng bản ghi trả về trong câu query
-- offset: bắt đầu tính từ bản ghi số bao nhiêu

select * from CHUYENBAY limit 3 offset 0;
select * from CHUYENBAY limit 6 offset 6;

-- funtion :
-- min: tìm ra chi phí nhỏ nhất của tất cả các chuyến bay
select min(ChiPhi) from CHUYENBAY;
-- max: tìm ra chi phí lớn nhất trong tất cả các chuyến bay
select max(ChiPhi) from CHUYENBAY;

-- count: đếm số lượng bản ghi
select count(*) from chuyenbay; -- tổng 18, page: 3 bản ghi -> 6 page

-- sum: tính tổng giá trị
select sum(ChiPhi) from chuyenbay;

-- alias:
select * from chuyenbay;
select cb.MaCB as Ma_Chuyen_Bay,cb.GaDi as Ga_Di,cb.DoDai as Do_Dai from chuyenbay cb;

-- view
create view VIEW_CHUYEN_BAY as select cb.MaCB as Ma_Chuyen_Bay,cb.GaDi as Ga_Di,cb.DoDai as Do_Dai from chuyenbay cb;
select * from VIEW_CHUYEN_BAY;

--
select * from chuyenbay where GaDi is not null;

-- là từ bải 1-8 trong file CsdlHangkhong_.pdf

select count(c.MaMB),c.MaNV from nhanvien inner join chungnhan c on NHANVIEN.MaNV = c.MaNV
group by NHANVIEN.MaNV;

select * from nhanvien left join chungnhan c on NHANVIEN.MaNV = c.MaNV
group by NHANVIEN.MaNV;

-- 1: Cho biết các chuyến bay đi Lạt (DAD).
    select * from chuyenbay where GaDen = 'DAD';

-- 2: Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
    select * from maybay where TamBay > 10000;
-- 3: Tìm các nhân viên có lương nhỏ hơn 10,000.
    select * from nhanvien where Luong < 10000;
-- 4: Cho biết các chuyến bay có ñộ dài ñường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
    select * from chuyenbay where DoDai >8000 and DoDai < 10000;
-- 5: Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) ñi Ban Mê Thuộc (BMV).
    select * from chuyenbay where GaDen ='BMV' and GaDi = 'SGN';
-- 6: Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
    select count(*) from chuyenbay where GaDi = 'SGN';
-- 7: Có bao nhiêu loại máy báy Boeing
    select count(*) from maybay where Loai like 'Boeing%';
-- 8: Cho biết tổng số lương phải trả cho các nhân viên
    select sum(Luong) from nhanvien;

-- join

-- inner join
    -- hiển thị các nhân viên có chứng nhận lái máy bay
    select * from nhanvien inner join chungnhan c on NHANVIEN.MaNV = c.MaNV;
    -- đếm số lượng chwusng nhận lái máy bay của mỗi nhân viên
    -- group by: gom nhóm các bảng ghi theo một trường dữ liệu
    select c.MaNV,count(c.MaNV) from nhanvien inner join chungnhan c on NHANVIEN.MaNV = c.MaNV
    group by c.MaNV;

-- left join

    select * from NHANVIEN left join chungnhan c on NHANVIEN.MaNV = c.MaNV;
    -- đếm số lượng các nhân viên chưa có bằng lái máy bay
    select c.MaMB as MaMayBay,NHANVIEN.Ten from NHANVIEN left join chungnhan c on NHANVIEN.MaNV = c.MaNV;
    select count(*) from
                  (select c.MaMB as MaMayBay,NHANVIEN.Ten from NHANVIEN left join chungnhan c on NHANVIEN.MaNV = c.MaNV)
                      as term
    where term.MaMayBay is null ;

-- right join: lấy tất cả các bản ghi của bảng bên phải và các bản ghi thỏa mãn của bên trái, các bản ghi
    -- bên phải không có các bản ghi bên trái thỏa mãn dữ liệu sẽ hiển thị null tại các trường đó
    -- số lượng bản ghi bảng chungnhan ít hơn bảng NHANVIEN
    select * from NHANVIEN right join chungnhan c on NHANVIEN.MaNV = c.MaNV order by NHANVIEN.MaNV desc ;
    -- order by: sắp xếp các bản ghi theo một qắc từ lớn đến bé hoặc ngược lại asc: mặc tăng dần, desc: giảm dần

-- having: giới hạn số lượng bản ghi được lấy ra theo một điều kiện dựa vào kết quả cảu các hàm
    -- sum, max,min..
    select sum(ChiPhi),GaDi from chuyenbay group by GaDi having sum(ChiPhi) > 190;

select ChiPhi,GaDi from chuyenbay group by GaDi,ChiPhi having ChiPhi > 200;

select * from chuyenbay having ChiPhi > 190;






-- 10 Cho biết các nhân viên có thể lái máy bay có mã số 747

use plane;

select * from nhanvien inner join chungnhan c on nhanvien.MaNV = c.MaNV
where c.MaMB = '747';

-- 11 join bang may bay va nhan vien voi ten co ho nguyen

-- 12 Cho biết mã số của các phi công vừa lái ñược Boeing vừa lái ñược Airbus

select MaMB from maybay where Loai like '%Boeing%';

select MaMB from maybay where Loai like '%Airbus%';

select * from chungnhan where MaNV = '567354612' ;

select * from chungnhan
inner join maybay m on chungnhan.MaMB = m.MaMB
where m.Loai like 'Boeing' and m.Loai;

-- nhung ng lai dauoc boing
select * from chungnhan where MaMB in (select MaMB from maybay where Loai like '%Boeing%');

select chungnhan.MaNV as MaNV,m.Loai,m.MaMB as MaMB from chungnhan inner join maybay m on chungnhan.MaMB = m.MaMB where m.Loai like '%Boeing%';

-- nhung ng lai duoc aribus
select * from chungnhan where MaMB in (select MaMB from maybay where Loai like '%Airbus%');
select chungnhan.MaNV as MaNV,m.Loai,m.MaMB as MaMB from chungnhan inner join maybay m on chungnhan.MaMB = m.MaMB where m.Loai like '%Airbus%';

-- join lai voi nhau
select * from
(select chungnhan.MaNV as MaNV,m.Loai,m.MaMB as MaMB from chungnhan inner join maybay m on chungnhan.MaMB = m.MaMB where m.Loai like '%Airbus%') Airbus
inner join
(select chungnhan.MaNV as MaNV,m.Loai,m.MaMB as MaMB from chungnhan inner join maybay m on chungnhan.MaMB = m.MaMB where m.Loai like '%Boeing%') Boeing
on Airbus.MaNV = Boeing.MaNV group by Airbus.MaNV order by Airbus.MaNV desc ;

-- 13 Cho biết các loại máy bay có thể thực hiện chuyến bay VN280

select DoDai from chuyenbay where MaCB = 'VN280';

select * from maybay where maybay.TamBay > (select DoDai from chuyenbay where MaCB = 'VN280');

-- 14 Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.

select TamBay from maybay where Loai = 'Airbus A320';

select * from chuyenbay where DoDai < (select TamBay from maybay where Loai = 'Airbus A320');

-- 15 Cho biết tên của các phi công lái máy bay Boeing.
select nhanvien.Ten,m.Loai from nhanvien
    inner join chungnhan c on nhanvien.MaNV = c.MaNV
    inner join maybay m on c.MaMB = m.MaMB
where m.Loai like '%Boeing%' group by Ten;

-- 16 Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay ñó.

select count(MaNV),MaMB from chungnhan group by MaMB;

-- 17 Giả sử một hành khách muốn ñi thẳng từ ga A ñến ga B rồi quay trở về ga A. Cho biết các ñường
-- bay nào có thể ñáp ứng yêu cầu này.

-- 18. Với mỗi ga có chuyến bay xuất phát từ ñó cho biết có bao nhiêu chuyến bay khởi hành từ ga ñó.
select count(*),GaDi from chuyenbay group by GaDi;

-- 19 Với mỗi ga có chuyến bay xuất phát từ ñó cho biết tổng chi phí phải trả cho phi công lái các
-- chuyến bay khởi hành từ ga ñó.
select sum(ChiPhi),GaDi from chuyenbay group by GaDi;

-- 20 Với mỗi ñịa ñiểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.

select count(*),GaDi from chuyenbay where GioDi < '12:00:00' group by GaDi;

-- 21. Cho biết mã số của các phi công chỉ lái ñược 3 loại máy bay
select count(*),MaNV from chungnhan group by MaNV having count(*) = 3;

-- 22
select count(*),MaNV from chungnhan group by MaNV having count(*) > 3;

select max(m.TamBay),chungnhan.MaNV from chungnhan
inner join (select count(*),MaNV from chungnhan group by MaNV having count(*) > 3) a
on chungnhan.MaNV = a.MaNV
inner join maybay m on chungnhan.MaMB = m.MaMB group by chungnhan.MaNV
;
-- chung minh
select TamBay,chungnhan.MaNV from chungnhan
                                             inner join (select count(*),MaNV from chungnhan group by MaNV having count(*) > 3) a
                                                        on chungnhan.MaNV = a.MaNV
                                             inner join maybay m on chungnhan.MaMB = m.MaMB order by chungnhan.MaNV desc
;

-- 23

select count(*),MaNV from chungnhan group by MaNV;

-- 24 Cho biết mã số của các phi công có thể lái ñược nhiều loại máy bay nhất.
select max(count),MaNV from (select count(*) as count,MaNV from chungnhan group by MaNV) a;


-- 25. Cho biết mã số của các phi công có thể lái ñược ít loại máy bay nhất
select min(count),MaNV from (select count(*) as count,MaNV from chungnhan group by MaNV) a;

-- 26 Tìm các nhân viên không phải là phi công







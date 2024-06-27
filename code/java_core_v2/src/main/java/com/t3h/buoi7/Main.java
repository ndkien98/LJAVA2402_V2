package com.t3h.buoi7;

public class Main {

    /**

     * Định nghĩa:
        - là mối quan hệ của hai class trong Java gọi là class Cha(Supper class) và class con (Sub class)
        khi supper class cho sub class kế thừa
        => class con có thể có tất cả các thuộc tính, các method của supper class
        nhưng chỉ được truy cập vào các thuộc tính và method có access modify(phạm vi truy cập) là
        public hoặc protected.

     * super()
        - là tham chiếu để gọi tới object cha, gần nhất

     * Ghi đè phương thức (overriding)
        - sảy ra giữa hai class có quan hệ kế thừa
        khi class con có một method giống y hệ với method tại class cha
        giống: kiểu trả về, tên hàm, số lượng các tham số truyền vào, kiểm dữ liệu của các tham số truyền vào
        => khi đó method đó tại sub class được gọi là phường thức ghi đè từ supper class

     * Nạp chồng phương thức (overloading)
        - sảy ra trong một class
        - khi hai method có cùng tên, khác nhau số lượng tham số truyền vào hoặc khác nhau kiểu dữ liệu của các tham số truyền vào
        hoặc khác nhau về kiểu trả về
        => đó là hai method overloading

     Bài 2)
     Để quản lý khách hàng đến thuê phòng của một khách sạn,
     người ta cần các thông tin sau:
     Số ngày thuê,
     loại phòng,
     thông tin cá nhân của những người thuê phòng.
     Biết rằng phòng loại A có giá 500$, phòng loại B có giá 300$ và loại C có giá 100$.
     Với mỗi cá nhân cần quản lý các thông tin sau:
     Họ tên,
     tuổi,
     số chứng minh nhân dân.
     Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân của những người thuê phòng.
     Yêu cầu 2: Xây dựng lớp KhachSan để quản lý các thông tin về các phòng trong khác sạn.
     Yêu cầu 3: Xây dựng các phương thức
         + thêm mới
         + xoá khách theo số chứng minh nhân dân.
         + Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức:
         tiền = (số ngày thuê * giá của từng loại phòng)
C1:
     Class: Nguoi
        filed:
            Họ tên String
            tuoi int
            cmnd String
     Supper Class: Phong ( một phòng có nhiều người thuê)
        filed:
            Số ngày thuê : int
            thông tin cá nhân của những người thuê phòng : Nguoi []
            giá : float
     Sub class: PhongA, PhongB,PhongC kế thừa Phong
            override lại làm giá phòng
            với PhongA => giá = 500
                PhongB => giá = 300
                PhongC => giá = 100
     Class: KhachSan
            filed:
               Phong[] danhSachCacPhong;
               int tongSoCacPhong
                int soLuongPhongDaDungHienTai
Yêu cầu 3:
     Xây dựng các phương thức
     thêm mới, xoá khách theo số chứng minh nhân dân.
     Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức:
     (số ngày thuê * giá của từng loại phòng)

     - Thêm mới phòng
        + thêm danh sách người vào phòn
     - Xóa đi phòng theo chứng minh nhân dân của khách thuê phòng
     - Sửa người trong phòng




     Bài 4)
     Thư viện trung tâm đại học quốc gia có nhu cầu quản lý việc mượn, trả sách.
     Sinh viên đăng ký tham gia mượn sách thông qua thẻ mà thư viện cung cấp.
     Với mỗi thẻ sẽ lưu các thông tin sau:
        Mã phiếu mượn, ngày mượn, hạn trả, số hiệu sách, và các thông tin cá nhân của sinh viên mượn sách.
     Các thông tin của sinh viên mượn sách bao gồm: Họ tên, tuổi, lớp.
     Để đơn giản cho ứng dụng console. Chúng ta mặc định ngày mượn, ngày trả là số nguyên dương.
     Yêu cầu 1: Xây dựng lớp SinhVien để quản lý thông tin của mỗi sinh viên.
     Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.
     Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.
     */
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setSalary(100000);
        developer.address = "HN";
        developer.setBonus(1000);
        System.out.println(developer.toString());
    }
}

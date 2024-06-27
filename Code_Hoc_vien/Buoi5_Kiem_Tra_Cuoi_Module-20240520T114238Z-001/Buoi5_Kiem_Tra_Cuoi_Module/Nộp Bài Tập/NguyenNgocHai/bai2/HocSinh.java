package com.t3h.NguyenNgocHai.bai2;

public class HocSinh {
   /** Để quản lý hồ sơ học sinh của trường THPT nhà trường cần các thông tin sau:
    các thông tin về cá nhân của mỗi học sinh.
    Mỗi học sinh có các thông tin sau: Mã học sinh ,Họ tên, tuổi, quê quán, năm sinh, số điện thoại, ngày tháng năm sinh
    Yêu cầu 1: Xây dựng Lớp HocSinh để quản lý thông tin của mỗi học sinh.
    Yêu cầu 2: Xây dựng các phương thức thêm, hiển thị thông tin của mỗi học sinh.
    Yêu cầu 3: Cài đặt chương trình có các chức năng sau:
            1) Hiển thị danh sách học sinh
2) Thêm học sinh mới với đầy đủ thông tin.
3) Hiển thị các học sinh có tuổi là 23 và quê ở Đà Nẵng.
4) Nhập vào tên hoặc năm sinh của sinh viên tìm kiếm các học sinh có thuông tin tương tự
	- lưu ý: cho phép tìm kiếm học sinh theo tên không bắt buộc chính xác 100%
    vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều có thể tìm ra
5) Nhập vào mã học sinh và Tên học sinh, nếu trùng sẽ xóa đi học sinh đó, tên bắt buộc tìm kiếm phải đúng 100%, vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều không thể tìm ra. Chỉ tìm ra và xóa khi nhập đúng Nguyễn Đắc Kiên
6) Cho phép nhập vào mã học sinh, hiển thị thông tin của sinh viên đó ra màn hình console
    và cho phép nhập thông tin mới để chỉnh sửa tất cả thông tin của sinh viên đó, ngoại trừ mã sinh viên
    */
   private String maHocSinh;
   private String hoTen;
   private int tuoi;
   private String queQuan;
   private int namSinh;
   private String soDienThoai;
   private String ngayThangNamSinh;

   public HocSinh(String maHocSinh, String hoTen, int tuoi, String queQuan, int namSinh, String soDienThoai, String ngayThangNamSinh) {
       this.maHocSinh = maHocSinh;
       this.hoTen = hoTen;
       this.tuoi = tuoi;
       this.queQuan = queQuan;
       this.namSinh = namSinh;
       this.soDienThoai = soDienThoai;
       this.ngayThangNamSinh=ngayThangNamSinh;
   }
   public String getMaHocSinh() {
       return maHocSinh;
   }
   public String getHoTen() {
       return hoTen;
   }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
       return tuoi;
    }
    public void setTuoi(int tuoi){
       this.tuoi = tuoi;
    }
    public String getQueQuan(){
       return queQuan;
    }
    public void setQueQuan(String queQuan){
       this.queQuan= queQuan;
    }
    public int getNamSinh(){
       return namSinh;
    }
    public void setNamSinh(int namSinh){
       this.namSinh=namSinh;
    }
    public String getSoDienThoai(){
       return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai){
       this.soDienThoai=soDienThoai;
    }
    public String getNgayThangNamSinh(){
       return ngayThangNamSinh;
    }
    public void setNgayThangNamSinh(String ngayThangNamSinh){
       this.ngayThangNamSinh=ngayThangNamSinh;
    }
    public String toString(){
        return "HocSinh{" +
                "maHocSinh='" + maHocSinh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh=" + namSinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", ngayThangNamSinh='" + ngayThangNamSinh + '\'' +
                '}';
    }
}


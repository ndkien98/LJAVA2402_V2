package com.t3h.buoi10.demoabstract;
// cú pháp khai báo abstract class
public abstract class Hinh {
    private String mauSac;
    private String tenHinh;
    /**
     - luôn được sử dụng để các class khác kế thừa
     - tính chất class abstract
        + Lớp abstract có thể có các phương thức abstract hoặc non-abstract
        + có thể có 0,1 hoặc nhiều phương thức trừu tượng
        + không thể tạo trức tiếp được đối tượng từ abstract class
        + tất cả các class khi extent lại abstract class bắt buộc phải
        override lại các method, còn với các method non-abstract có
        thể override hoặc không
     phương thức abstract:
        là phương thức trừu tượng, trong phương thức đấy sẽ chỉ
        có :
            kiểu trả về
            tên hàm
            kiểu dữ liệu truyền vào
     bt:
        Tạo class Abstract NganHang với các thuộc tính:
            tên ngân hàng, địa chỉ
            - method abstract:
                + String chuyenTien(int soTien)
                + String rutTien(int soTien)
        Tạo ra hai class Bidv, Shb kế thừa từ NganHang
     yêu cầu:
        - override lại các method
        - tạo ra hai đối tượng bidv và shb
        - gọi tới các hàm chuyenTien, rutTien và tự định nghĩa ra các
        thông điệp khi gọi hàm

     */
    // demo phương thức abstract
    public abstract void veHinh(String tenHinh);
    public abstract void veHinhNangCao();
    // method non-abstract ( hàm thông thường)
    public String getMauSac() {
        return mauSac;
    }

    public String getTenHinh() {
        return tenHinh;
    }
}

package com.t3h.buoi9;

public class Bank {

    private Long soDuTaiKhoan;
    // cách khai báo thuộc tính final
    private final String sdt;


    public Bank(String sdt) {
        this.sdt = sdt;
    }

    public void hienThiSoDuTaiKhoan(){
        System.out.println(this.soDuTaiKhoan);
    }

    public final void setSoDuTaiKhoan(Long soDuTaiKhoan) {
        // kiểm tra xem có đúng là chủ tài khoản không

        // kiểm tra xem số dư tài khoản có bị thay đổi
        // bất thường hay không

        // mọi điều kiện thỏa mãn
        // => mới cho phép thay đổi số dư
        this.soDuTaiKhoan = soDuTaiKhoan;
    }
}

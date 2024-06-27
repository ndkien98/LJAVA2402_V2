package org.example.Exercises.Test.Bai2;


public class HocSinh {
    private String maHocSinh;
    private String tenHocSinh;
    private int age;
    private String address;
    private int namSinh;
    private String phoneNumber;
    private String birthday;

    public HocSinh(String maHocSinh, String tenHocSinh, int age, String address, int namSinh, String phoneNumber, String birthday) {
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.age = age;
        this.address = address;
        this.namSinh = namSinh;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }


    @Override
    public String toString() {
        return "HocSinh{" +
                "maHocSinh='" + maHocSinh + '\'' +
                ", tenHocSinh='" + tenHocSinh + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", namSinh=" + namSinh +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public void hienThiThongTin() {
        System.out.println("Danh sách học sinh là: ");
        System.out.print(toString());
    }
}

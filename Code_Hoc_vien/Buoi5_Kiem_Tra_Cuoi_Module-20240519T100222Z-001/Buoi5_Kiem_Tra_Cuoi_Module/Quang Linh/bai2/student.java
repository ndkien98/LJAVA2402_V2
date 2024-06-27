package com.linh;

class Student {
    private String id;
    private String name;
    private int age;
    private String hometown;
    private String birthYear;
    private String[] phoneNumbers;
    private int phoneNumberCount;

    public Student(String id, String name, int age, String hometown, String birthYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.birthYear = birthYear;
        this.phoneNumbers = new String[5]; // Giả sử mỗi học sinh có tối đa 5 số điện thoại
        this.phoneNumberCount = 0;
    }

    // Thêm số điện thoại cho học sinh
    public void addPhoneNumber(String phoneNumber) {
        if (phoneNumberCount < phoneNumbers.length) {
            phoneNumbers[phoneNumberCount++] = phoneNumber;
        } else {
            System.out.println("Đã đạt số lượng tối đa của số điện thoại.");
        }
    }

    // Hiển thị thông tin học sinh
    public void displayInfo() {
        System.out.println("Mã số: " + id + ", Họ tên: " + name + ", Tuổi: " + age + ", Quê quán: " + hometown + ", Năm sinh: " + birthYear);
        System.out.print("Số điện thoại: ");
        for (int i = 0; i < phoneNumberCount; i++) {
            System.out.print(phoneNumbers[i] + " ");
        }
        System.out.println();
    }

    public int getAge() {
        return 0;
    }

    public String getHometown() {
        return "";
    }

    public String getName() {
        return "";
    }

    public String getId() {

        return "";
    }
}

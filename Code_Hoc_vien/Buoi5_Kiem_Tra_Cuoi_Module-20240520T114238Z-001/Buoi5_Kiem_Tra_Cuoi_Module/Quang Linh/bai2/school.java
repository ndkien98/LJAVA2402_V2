package com.linh;

class School {
    private Student[] students;
    private int studentCount;

    public School() {
        students = new Student[100]; // Giả sử trường có tối đa 100 học sinh
        studentCount = 0;
    }

    // Thêm học sinh mới vào trường
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Đã đạt số lượng tối đa của học sinh.");
        }
    }

    // Hiển thị danh sách học sinh
    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
    }

    // Hiển thị học sinh 23 tuổi và quê ở Đà Nẵng
    public void displayStudentsFromDaNang23() {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getAge() == 23 && "Đà Nẵng".equals(students[i].getHometown())) {
                students[i].displayInfo();
            }
        }
    }

    // Tìm kiếm học sinh theo tên hoặc mã số
    public void searchStudent(String keyword) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(keyword) || students[i].getId().equalsIgnoreCase(keyword)) {
                students[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với thông tin: " + keyword);
        }
    }

    // Các phương thức khác theo yêu cầu của bài tập
    // ...
}
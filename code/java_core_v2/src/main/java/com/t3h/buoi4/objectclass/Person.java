package com.t3h.buoi4.objectclass;
// tên class: Person
public class Person {
    // Khai báo các thuộc tính
    public String name;
    public String height;
    public String weight;
    private Long salary;

    // Khai báo các method
    public void goBy(){
        System.out.println("Person goby " + this.name);
    }
    public void goEat(){
        System.out.println("Person go eat " + this.name);
    }
    // Khai báo các constructor
    /**
     * Định nghĩa
         - là một method đặc biệt được sử dụng để khởi tạo đối tượng từ class, và lưu đối tượng vào vùng nhớ heap
         - là một method khởi tạo ô nhớ của đối tượng trong vùng nhớ heap
         - hàm đầu tiên được chạy khi khởi tạo đối tượng từ class

     * các loại constructor:
        + constructor không tham số
        + constructor có tham số

     1) constructor không tham số
        - sẽ tự động được tạo ra khi máy ảo jvm chạy
     2) constructor có tham số
        - sẽ phải tự tạo ra, không giới hạn hoặc bắt buộc phải có bao nhiêu
        tham số truyền vào

     * Lưu ý:
        - constructor không tham số theo mặc định sẽ không cần khai báo cũng có
        thể sử dụng
        - nhưng nếu đã khai báo constructor có tham số, thì bắt buộc cũng phải
            khai báo constructor không có tham số, thì mới sử dụng được
            constructor không có tham số
     */
    public Person(){
        System.out.println("constructor khởi chạy");
    }
    public Person(String name,String height){
        this.name = name;
    }
    public Person(String name){

    }

    // các method getter, setter
    public void setSalary(Long salary){
        this.salary = salary;
    }
}

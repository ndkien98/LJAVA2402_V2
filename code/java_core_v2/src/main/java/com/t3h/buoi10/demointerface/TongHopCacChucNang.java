package com.t3h.buoi10.demointerface;


// cú pháp tạo ra interface
public interface TongHopCacChucNang extends SupperI1,SupperI2 {

    /**
     - Định nghĩa:
        interface là một bản thiết kế mô tả hoặc quy định sẵn các chức năng của
        class. Còn việc triển khai các chức năng như thế nào sẽ phụ thuộc vào từng tính
        chất của các class khác nhau.
     - Đắc điểm:
        + Các phương thức trong interface đều là các phương thức abstract
        + Luôn luôn có modifier là: public interface, dù có khai báo rõ hay không
        + Các thuộc tính luôn là public static final dù có khai báo hay không
        + các method đều phải là method abstract
        + đ tạo ra được object từ interface bắt buộc phải có class triển khai interface đó
     - đặc điểm khác nhau giữa class và interface
        + class mô tả các thuộc tính và hành vi của một đối tượng
        + interface CHỈ mô tả các hành vi mà class nào đó muốn triển khai
            -> class nào triển khai interface cũng được
            -> triển khai interface:
                tức là implement lại interface và phải override lại các method của interface đấy
     - Đa kế thừ bởi interface
        + một class chỉ có thể kế thừa từ một class khác nhưng một interface có thể kế thừa
        từ nhiều interface khác nhau => đó là đa kế thừa bằng interface
        + một class có thể


     */
    public final String name="Tổng hợp các chức năng";
    public abstract void runnable();
    void flyable();
    void swimming();
    // từ version Java 8 thì bắt đầu có default method => là method có thân hàm
    default void demoDefault(){
        System.out.println("demo default method");
    }
}

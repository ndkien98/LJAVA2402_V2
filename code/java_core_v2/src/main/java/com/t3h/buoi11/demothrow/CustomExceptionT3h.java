package com.t3h.buoi11.demothrow;

import java.io.IOException;

/**
 Tự tạo ra exception bằng cách:
    b1: tạo 1 class CustomExceptionT3h( với tên tùy chỉnh)
    b2: xác định loại exception muốn tạo ra: checked hoặc unchecked
    b3: cho kế thừa class exception
        - nếu muốn tạo ra checked exception -> cho kế thừa class Exception
        - nếu muốn tạo ra unchecled excepion -> cho kế thừa RuntimeException
    b4:
        - tạo constructor không tham số và gọi tới hàm supper chuyền message mặc định
        - tạo ra constructor có tham số là message muốn custom theo ý

 */
// b1: tạo 1 class CustomExceptionT3h( với tên tùy chỉnh)
public class CustomExceptionT3h extends Exception { // b2,b3
    // tạo constructor không tham số và gọi tới hàm supper chuyền message mặc định
    public CustomExceptionT3h(){
        super("Lỗi mặc định của t3h");
    }
    // tạo ra constructor có tham số là message muốn custom theo ý
    public CustomExceptionT3h(String message){
        super(message);
    }
}

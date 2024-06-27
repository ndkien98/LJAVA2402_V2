package com.t3h.buoi11.bai1;

public class InvalidTriangleException extends Exception{

    public InvalidTriangleException(){
        super("Lỗi mặc định khi khởi tạo tam giác");
    }

    public InvalidTriangleException(String message){
        super(message);
    }
}

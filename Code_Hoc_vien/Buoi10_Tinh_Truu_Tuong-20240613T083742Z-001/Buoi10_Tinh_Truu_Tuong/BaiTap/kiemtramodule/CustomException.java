package com.javaweb.kiemtramodule;

public class CustomException extends Exception{
    public CustomException(){
        super("Lỗi Mặc Đnh");
    }
    public CustomException(String message){
        super(message);
    }
}

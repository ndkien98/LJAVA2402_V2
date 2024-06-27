package com.t3h.buoi14.chuabaikiemtramodule2.exceptions;

public class T3hCustomException extends Exception{

    public T3hCustomException(){
        super("t3h exception: đã sảy ra lỗi");
    }

    public T3hCustomException(String message){
        super(message);
    }
}

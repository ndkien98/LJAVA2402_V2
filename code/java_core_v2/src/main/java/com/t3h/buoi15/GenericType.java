package com.t3h.buoi15;

public class GenericType <T>{

    private T data;

    public GenericType(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

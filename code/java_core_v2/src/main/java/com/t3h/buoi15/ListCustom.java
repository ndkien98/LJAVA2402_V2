package com.t3h.buoi15;

// <T>: khai bao generic với tên biến là T
public class ListCustom <Y>{

    // Kiểu dữ liệu T
    private Y data;

    public Y getData() {
        return data;
    }

    public void setData(Y data) {
        this.data = data;
    }
}

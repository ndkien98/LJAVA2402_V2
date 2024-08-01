package com.t3h.buoi20.di.dao;

public class UserDaoMysql implements UserDao{
    @Override
    public void ketNoiDataBase() {
        System.out.println("Kết nối database mysql thành công");
    }

    @Override
    public void truyVanDuLieu() {
        System.out.println("Lấy danh sách user thành công tại mysql");
    }
}

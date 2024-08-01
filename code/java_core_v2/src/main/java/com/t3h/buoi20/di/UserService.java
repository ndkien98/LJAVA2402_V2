package com.t3h.buoi20.di;

import com.t3h.buoi20.di.dao.UserDao;
import com.t3h.buoi20.di.dao.UserDaoMysql;

public class UserService {

    // chuyên đảm nhận nhiệm vụ kết nối đến database
    // Khai báo đối tượng user
    UserDao userDao;

    public UserService(UserDao userDao){
        // Dependency Injection giúp userDao được khởi tạo
        this.userDao = userDao;
    }
    public void layDanhSachUser(){
        userDao.ketNoiDataBase();
        userDao.truyVanDuLieu();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

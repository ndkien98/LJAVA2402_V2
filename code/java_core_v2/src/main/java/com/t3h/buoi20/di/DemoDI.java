package com.t3h.buoi20.di;

import com.t3h.buoi20.di.dao.UserDao;
import com.t3h.buoi20.di.dao.UserDaoMysql;
import com.t3h.buoi20.di.dao.UserDaoOracle;

public class DemoDI {

    public static void main(String[] args) {
        UserService userService;

        // Khi muon ket noi su dung database Oracle
        UserDao userDao = new UserDaoOracle();
        // Thực hiện Dependency Injection
        // Tiêm object userDao đã được khởi tạo vào UserService
        userService = new UserService(userDao);
        userService.layDanhSachUser();

        System.out.println("----------------------");
        userDao = new UserDaoMysql();
        // Thực hiện Dependency Injection
        // Tiêm object userDao đã được khởi tạo vào UserService
        userService = new UserService(userDao);
        userService.layDanhSachUser();

    }
}

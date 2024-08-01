package com.t3h.buoi16.observers.model;

import com.t3h.buoi16.observers.LoginStatus;
import com.t3h.buoi16.observers.User;

public class Protector implements Observer{
    @Override
    public void update(User user) {
        System.out.println("Thực hiện bảo vệ tài khoản ");
        if (user.getStatus().equals(LoginStatus.EXPIRED) || user.getStatus().equals(LoginStatus.INVALID)){
            System.out.println("User status không hợp lệ");
        }else {
            System.out.println("User status login hợp lệ");
        }
    }
}

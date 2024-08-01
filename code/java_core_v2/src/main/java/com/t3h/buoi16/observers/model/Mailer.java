package com.t3h.buoi16.observers.model;

import com.t3h.buoi16.observers.User;

public class Mailer implements Observer{
    @Override
    public void update(User user) {
        System.out.println("Gửi email tới user thông báo đã đăng nhập: " + user.getEmail());
    }
}

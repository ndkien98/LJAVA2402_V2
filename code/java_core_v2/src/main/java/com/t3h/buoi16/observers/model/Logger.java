package com.t3h.buoi16.observers.model;

import com.t3h.buoi16.observers.User;

public class Logger implements Observer{
    @Override
    public void update(User user) {
        System.out.println("Ghi log user với thông tin: " + user.toString());
    }
}

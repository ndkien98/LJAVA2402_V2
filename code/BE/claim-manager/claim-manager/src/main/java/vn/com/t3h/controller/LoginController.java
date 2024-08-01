package vn.com.t3h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String LoginController() {
        return "guest/loginmetlife";
    }
}

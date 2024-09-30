package vn.com.t3h.controller.page.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public String profile(){
        return "cms/user/profile";
    }
}

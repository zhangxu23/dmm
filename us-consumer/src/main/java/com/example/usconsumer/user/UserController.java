package com.example.usconsumer.user;

import com.example.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeign userFeign;
    @RequestMapping("/login")
    public String Login(User user){
        return "result:"+userFeign.login(user);
    }
}


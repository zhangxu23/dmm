package com.example.usprovider.user;

import com.example.common.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProvider {

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        System.out.println("66666666666666666666"+user.getName());
        return "username:\n"+user.getName();

    }
}

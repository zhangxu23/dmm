package com.example.usconsumer.user;

import com.example.common.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public String login(User user) {
        return "error";
    }
}

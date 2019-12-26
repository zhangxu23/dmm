package com.example.usconsumer.user;

import com.example.common.User;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "us-provider",fallback = UserFeignFallback.class)
public interface UserFeign {
    @RequestMapping("/login")
    public String login(@RequestBody User user);
}

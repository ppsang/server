package com.test;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenhongwei
 * @date: Created in 上午11:28 2018/4/25
 * @version: 1.0
 */
@RestController
public class HelloWorld {

    @GetMapping("hello")
    public String sayHello(@CookieValue(value = "Authorization", required = false) String authorization) {

        return "hello" + "/" + authorization;
    }
}

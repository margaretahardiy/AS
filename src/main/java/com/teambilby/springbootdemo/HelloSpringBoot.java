package com.teambilby.springbootdemo;

//import com.teambilby.springbootdemo.dao.UserRepository;
//import com.teambilby.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String hello() {
        return String.format("Hello Spring Boot!");
    }
}

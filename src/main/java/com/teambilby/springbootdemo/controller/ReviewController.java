package com.teambilby.springbootdemo.controller;

import com.teambilby.springbootdemo.dao.UserRepository;
import com.teambilby.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController
{
    private UserRepository userRepository;
    @RequestMapping("/review")
    public String review() {
        Iterable<User> users = userRepository.findAll();
//        System.out.println(users.toString());
        return "hello.html";
    }
}

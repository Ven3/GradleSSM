package com.angie.controller;


import com.angie.entity.User;
import com.angie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    @ResponseBody()
    public List<User> getUsers(){
        List<User> users=userService.getUsers();
        return users;
    }

    @GetMapping("/{View}")
    public void getView(){}

}

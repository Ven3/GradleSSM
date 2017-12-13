package com.angie.test;

import com.angie.entity.User;
import com.angie.service.UserService;
import org.junit.Test;

import java.util.List;

public class MapperTest {


    private UserService userService=new UserService();

    @Test
    public void getAll(){

        System.out.println(userService==null);
        List<User> userList=userService.getUsers();

    }
}

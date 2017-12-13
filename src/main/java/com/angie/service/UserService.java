package com.angie.service;

import com.angie.dao.UserDao;
import com.angie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUsers(){
        if(userDao!=null){
            System.out.println("!=null");
            return userDao.getUsers();
        }

        System.out.println("userDao NULL");
        return null;

    }

}

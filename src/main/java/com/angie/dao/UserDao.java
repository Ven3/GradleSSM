package com.angie.dao;

import com.angie.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public boolean login(User user);

}

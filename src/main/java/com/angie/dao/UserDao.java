package com.angie.dao;

import com.angie.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserDao {

    public boolean login(User user);

    public List<User> getUsers();

}

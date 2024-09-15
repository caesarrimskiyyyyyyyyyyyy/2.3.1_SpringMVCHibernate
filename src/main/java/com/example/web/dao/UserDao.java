package com.example.web.dao;

import com.example.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAll();

    void createUser(User user);
}

package com.example.web.dao;

import com.example.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> showAll();

    void saveUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);

    void updateUser(User user);
}

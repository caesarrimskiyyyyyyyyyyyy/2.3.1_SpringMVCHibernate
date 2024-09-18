package com.example.web.service;

import com.example.web.model.User;

import java.util.List;

public interface UserService {
    List<User> showAll();

    void saveUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);

    void updateUser(User user);
}

package com.example.web.service;

import com.example.web.model.User;

import java.util.List;

public interface UserService {
    List<User> showAll();

    void createUser(User user);
}

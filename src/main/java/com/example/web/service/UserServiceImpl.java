package com.example.web.service;

import com.example.web.dao.UserDao;
import com.example.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> showAll() {
        return userDao.showAll();
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }
}

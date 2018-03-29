package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) throws Exception{
        this.userDao = userDao;
    }

    @Override
    public User getUserById(Integer userId) throws Exception{
        return userDao.selectUserById(userId);
    }

    @Override
    public List<User> getAllUsers()  throws Exception{
        return userDao.selectAllUsers();
    }

    @Override
    public Integer deleteUserById(Integer userId)  throws Exception{
        return userDao.deleteUserById(userId);
    }

    @Override
    public Integer updateUser(User user)  throws Exception{
        return userDao.updateUser(user);
    }

    @Override
    public Integer addUser(User user)  throws Exception{
        return userDao.insertUser(user);
    }
}

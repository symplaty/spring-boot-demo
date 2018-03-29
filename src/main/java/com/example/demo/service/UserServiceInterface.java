package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserServiceInterface {
    User getUserById(Integer userId) throws Exception;
    List<User> getAllUsers() throws Exception;
    Integer deleteUserById(Integer userId) throws Exception;
    Integer updateUser(User user) throws Exception;
    Integer addUser(User user) throws Exception;
}

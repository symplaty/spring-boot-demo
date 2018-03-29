package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserServiceInterface userService;
    @Autowired
    public UserController(UserServiceInterface userService){
        this.userService = userService;
    }

    @RequestMapping("/getUserById")
    public User getUserById(Integer userId){
        try {
            return userService.getUserById(userId);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers(){
        try {
            return userService.getAllUsers();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/deleteUserById")
    public Integer deleteUserById(Integer userId){
        try {
            return userService.deleteUserById(userId);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/updateUser")
    public Integer updateUser(User user){
        try {
            return userService.updateUser(user);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/addUser")
    public Integer addUser(User user) {
        try {
            return userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

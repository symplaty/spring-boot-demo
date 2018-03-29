package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    User selectUserById(Integer userId);
    List<User> selectAllUsers();
    Integer deleteUserById(Integer userId);
    Integer updateUser(User user);
    Integer insertUser(User user);
}

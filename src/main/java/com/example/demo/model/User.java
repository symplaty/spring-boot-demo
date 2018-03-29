package com.example.demo.model;

public class User {
    private Integer userId;
    private String userPwd;
    private String userName;
    private Integer iState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getiState() {
        return iState;
    }

    public void setiState(Integer iState) {
        this.iState = iState;
    }
}

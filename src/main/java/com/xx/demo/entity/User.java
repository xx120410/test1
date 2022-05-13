package com.xx.demo.entity;

import lombok.Data;

/**
 * @author ssss
 * @date 2022/1/11 11:31
 */
@Data
public class User {
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

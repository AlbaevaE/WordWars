package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    User findUserById(Long id);
    User saveUser(User u);
    User updateUser(User u);
    void deleteUserById(Long id);
    void deleteAllUsers();
    boolean checkUser(Long id, String login,String password);

}

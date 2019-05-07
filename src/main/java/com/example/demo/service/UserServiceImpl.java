package com.example.demo.service;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User u) {
        return this.userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return this.userRepository.save(u);
    }

    @Override
    public void deleteUserById(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
        this.userRepository.deleteAll();
    }

    @Override
    public boolean checkUser(Long id, String login, String password) {
        if(userService.findUserById(id).getLogin().equals(login)){
            if(checkUserByPassword(id, login, password)){
                return true;
            }
        }
        return false;
    }

    public boolean checkUserByPassword(Long id, String login, String password){
        if(userService.findUserById(id).getLogin().equals(login) &&
                userService.findUserById(id).getPassword().equals(password)){
            return true;
        }
        return false;
    }
}

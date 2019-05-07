package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserController userController;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id,
                            @RequestHeader(name = "user-login") String login,
                            @RequestHeader(name = "user-password") String password) {

        if (!userService.checkUser(id, login, password)) {
            return null;
        }
        return this.userService.findUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User u) {
        return this.userService.saveUser(u);
    }

    @PutMapping
    public User updateUser(@RequestBody User u) {
        return this.userService.updateUser(u);
    }

    @DeleteMapping
    public void deleteAllUsers() {
        this.userService.deleteAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        this.userService.deleteUserById(id);
    }

}

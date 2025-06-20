package com.example.batch3restapis.controllers;

import com.example.batch3restapis.dtos.CreateUserRequest;
import com.example.batch3restapis.dtos.CreateUserResponse;
import com.example.batch3restapis.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/2")
public class UserController2 {

    private UserService userService;

    public UserController2() {
        this.userService = new UserService();
    }

    @PostMapping("/add")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
//        UserService userService = new UserService();
        return this.userService.createUser(createUserRequest);
    }
}

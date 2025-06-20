package com.example.batch3restapis.controllers;

import com.example.batch3restapis.dtos.*;
import com.example.batch3restapis.models.User;
import com.example.batch3restapis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    @PostMapping("/add")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
//        UserService userService = new UserService();
        return this.userService.createUser(createUserRequest);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
//        UserService userService = new UserService();
        return this.userService.getAll();
    }

    @GetMapping("/get")
    public GetUserDetails getUserByIdRP(@RequestParam(value = "id") Integer id) {
        return this.userService.getUserById(id);
    }

    @GetMapping("/get/{id}")
    public GetUserDetails getUserByIdPV(@PathVariable("id") Integer id) {
        return this.userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public GetUserDetails updateUser(@PathVariable("id") Integer id,
            @RequestBody UpdateUserRequest updateUserRequest) {
        return this.userService.updateUser(id,updateUserRequest);
    }

    @PatchMapping("/patch/{id}")
    public GetUserDetails patchUser(@PathVariable("id") Integer id,
                                     @RequestBody PatchUserRequest patchUserRequest) {
        return this.userService.patchUser(id,patchUserRequest);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam(value = "id") Integer id) {
        this.userService.deleteUser(id);
    }



}

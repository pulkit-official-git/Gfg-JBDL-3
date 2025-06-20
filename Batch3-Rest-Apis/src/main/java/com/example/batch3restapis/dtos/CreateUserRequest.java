package com.example.batch3restapis.dtos;

import com.example.batch3restapis.models.Gender;
import com.example.batch3restapis.models.User;
import com.example.batch3restapis.models.UserStatus;

import java.util.Date;

public class CreateUserRequest {

    private String username;
    private String password;
    private String email;
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User dtoToModel(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        user.setCreatedOn(new Date());
        user.setUpdatedOn(new Date());
        user.setStatus(UserStatus.ACTIVE);
        return user;
    }
}

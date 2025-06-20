package com.example.batch3restapis.dtos;

import com.example.batch3restapis.models.Gender;
import com.example.batch3restapis.models.User;

import java.util.Date;

public class PatchUserRequest {

    private String username;
    private String password;
    private String email;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User fromDtoToModel(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setGender(gender);
        user.setUpdatedOn(new Date());
        return user;
    }
}

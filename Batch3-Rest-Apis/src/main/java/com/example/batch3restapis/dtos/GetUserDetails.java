package com.example.batch3restapis.dtos;

import com.example.batch3restapis.models.Gender;
import com.example.batch3restapis.models.User;

public class GetUserDetails {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private Gender gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static GetUserDetails fromModelToDto(User user) {
        if(user == null){
            return null;
        }
        GetUserDetails getUserDetails = new GetUserDetails();
        getUserDetails.setId(user.getId());
        getUserDetails.setUsername(user.getUsername());
        getUserDetails.setPassword(user.getPassword());
        getUserDetails.setEmail(user.getEmail());
        getUserDetails.setGender(user.getGender());
        return getUserDetails;
    }
}

package com.example.batch3restapis.service;

import com.example.batch3restapis.dtos.*;
import com.example.batch3restapis.models.User;
import com.example.batch3restapis.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class UserService {

    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

        User user = createUserRequest.dtoToModel();
//        UserRepository userRepository = new UserRepository();
        user = this.userRepository.createUser(user);
        return CreateUserResponse.fromModelToDto(user);

    }

    public List<User> getAll() {
//        UserRepository userRepository = new UserRepository();
        return this.userRepository.getAll();
    }

    public GetUserDetails getUserById(Integer id) {
        User user = this.userRepository.getUserById(id);
        return GetUserDetails.fromModelToDto(user);

    }

    public GetUserDetails updateUser(Integer id, UpdateUserRequest updateUserRequest) {
        User user = updateUserRequest.fromDtoToModel();
        user = this.userRepository.updateUser(id,user);
        return GetUserDetails.fromModelToDto(user);
    }

    public GetUserDetails patchUser(Integer id, PatchUserRequest patchUserRequest) {
        User incomingUser = patchUserRequest.fromDtoToModel();
        User existingUser = this.userRepository.getUserById(id);
        User mergedUser = this.merge(incomingUser, existingUser);
        mergedUser = this.userRepository.updateUser(id,mergedUser);
        return GetUserDetails.fromModelToDto(mergedUser);

    }

    private User merge(User incomingUser, User existingUser) {
        if(existingUser == null){
            return null;
        }
        if(incomingUser.getUsername()!=null){
            existingUser.setUsername(incomingUser.getUsername());
        }
        if(incomingUser.getPassword()!=null){
            existingUser.setPassword(incomingUser.getPassword());
        }
        if(incomingUser.getEmail()!=null){
            existingUser.setEmail(incomingUser.getEmail());
        }
        if(incomingUser.getGender()!=null){
            existingUser.setGender(incomingUser.getGender());
        }
        existingUser.setUpdatedOn(incomingUser.getUpdatedOn());

        return existingUser;
    }

    public void deleteUser(Integer id) {
        User user = this.userRepository.getUserById(id);
        this.userRepository.deleteUser(user);
    }
}
/*
* bulky code
* not scalable
* not maintainable
* */
package com.example.batch3restapis.repositories;

import com.example.batch3restapis.models.User;
import com.example.batch3restapis.models.UserStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class UserRepository {

    Map<Integer,User> users = new HashMap<Integer,User>();

    public User createUser(User user) {
        Integer userId = new Random().nextInt(100);
        user.setId(userId);
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getAll() {
        return new ArrayList<User>(users.values());
    }

    public User getUserById(Integer id) {
        if(!users.containsKey(id)) {
            return null;
        }
        return users.get(id);
    }

    public User updateUser(Integer id, User user) {
        if(!users.containsKey(id)) {
            return null;
        }
        user.setId(id);
        users.put(user.getId(), user);
        return user;
    }

    public void deleteUser(User user) {
        if(!users.containsKey(user.getId())) {
            return;
        }
        user.setStatus(UserStatus.INACTIVE);
        users.put(user.getId(), user);
    }
}

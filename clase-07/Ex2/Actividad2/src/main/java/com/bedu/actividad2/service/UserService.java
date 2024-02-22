package com.bedu.actividad2.service;

import com.bedu.actividad2.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    Map<Long, User> users = new HashMap<>();
    private Long nextId =1L;

    public Map<Long, User> getAllUsers() {
        return users;
    }
    public void addUser(Long id,User user){
        user.setId(nextId++);
        users.put(id,user);
    }
    public void deletUser(Long id){
        users.remove(id);
    }
}

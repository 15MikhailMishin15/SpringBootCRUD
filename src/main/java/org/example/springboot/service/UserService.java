package org.example.springboot.service;

import org.example.springboot.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    User updateUser(User user);
    void deleteById(Long id);
}

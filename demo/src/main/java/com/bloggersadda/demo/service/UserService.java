package com.bloggersadda.demo.service;

import com.bloggersadda.demo.model.User;
import com.bloggersadda.demo.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

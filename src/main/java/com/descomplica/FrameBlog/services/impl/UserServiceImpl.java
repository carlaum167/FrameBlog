package com.descomplica.FrameBlog.services.impl;

import com.descomplica.FrameBlog.modelos.User;
import com.descomplica.FrameBlog.repositories.UserRepository;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository

    @Override
    public User save(final User){
        User existingUser = UserRepository.findByUsername(User.getName());
        if (Objects.nonNull(existingUser)){
            throw new RuntimeException("Existing User");
        }
        User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole());
        User newUser = UserRepository.save(entity);
        return new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getRole());
    }
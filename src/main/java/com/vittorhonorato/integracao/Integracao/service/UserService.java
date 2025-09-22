package com.vittorhonorato.integracao.Integracao.service;

import com.vittorhonorato.integracao.Integracao.entity.User;
import com.vittorhonorato.integracao.Integracao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

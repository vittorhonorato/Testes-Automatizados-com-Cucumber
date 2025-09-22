package com.vittorhonorato.integracao.Integracao.service;

import com.vittorhonorato.integracao.Integracao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
}

package com.example.stock.erp.service;

import com.example.stock.erp.dao.User;
import com.example.stock.erp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}

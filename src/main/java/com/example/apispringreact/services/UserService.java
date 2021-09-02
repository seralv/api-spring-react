package com.example.apispringreact.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.apispringreact.models.Users;
import com.example.apispringreact.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<Users> listUsers() {
        return userRepository.findAll();
    }
    
}

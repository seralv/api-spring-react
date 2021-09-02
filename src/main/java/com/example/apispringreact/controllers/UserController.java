package com.example.apispringreact.controllers;

import java.util.List;

import com.example.apispringreact.models.Users;
import com.example.apispringreact.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/listusers")
    public ResponseEntity<List<Users>> listUsers() {
        List<Users> users = userService.listUsers();
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }
    
}

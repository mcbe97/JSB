package com.tms.a1.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.tms.a1.entity.User;
import com.tms.a1.service.UserService;

public class UserController {

    @Autowired
    private UserService userService;
    
     @GetMapping("/getUser")
    public ResponseEntity<?> getUser() {
        User user = userService.getUser();
        
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}

package com.example.useronboarding.controller;

import com.example.useronboarding.model.User;
import com.example.useronboarding.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/onboard")
    public ResponseEntity<User> onboardUser(@RequestBody User user) {
        logger.info("Onboarding user: {}", user.getUsername());
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}

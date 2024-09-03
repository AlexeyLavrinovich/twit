package com.education.twit.controller;

import com.education.twit.entity.User;
import com.education.twit.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

}

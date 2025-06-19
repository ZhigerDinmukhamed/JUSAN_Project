package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/Zhiger")

public class UserController {
    private final UserService service;

    @GetMapping("/Zhiga")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

}

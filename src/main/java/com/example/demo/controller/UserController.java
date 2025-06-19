package com.example.demo.controller;

import com.example.demo.feignClient.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contract")
public class UserController {

    private final UserService service;

    @SneakyThrows
    @PostMapping("/upload")
    public String uploadContract(@RequestPart("file") MultipartFile file, @RequestPart("meta") UserDto userDto) {
        return service.encodeToBase64(file.getBytes());

    }
}
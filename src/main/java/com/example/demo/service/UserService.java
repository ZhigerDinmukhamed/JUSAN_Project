package com.example.demo.service;

import com.example.demo.feignClient.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Base64;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    public String encodeToBase64(byte[] fileBytes) {
        return Base64.getEncoder().encodeToString(fileBytes);
    }
}

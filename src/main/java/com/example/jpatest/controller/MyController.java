package com.example.jpatest.controller;

import com.example.jpatest.entity.User;
import com.example.jpatest.service.MyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final MyServiceImpl service;

    @GetMapping("/temp")
    public List<User> user(){
        return service.getAll();
    }
}

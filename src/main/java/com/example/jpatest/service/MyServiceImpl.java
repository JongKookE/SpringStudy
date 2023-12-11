package com.example.jpatest.service;

import com.example.jpatest.entity.User;
import com.example.jpatest.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyServiceImpl implements MyService{

    private final MyRepository myRepository;

    @Override
    public List<User> getAll() {
        return myRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return myRepository.findById(id).orElse(null);
    }
}

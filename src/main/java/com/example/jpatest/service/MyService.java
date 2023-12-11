package com.example.jpatest.service;

import com.example.jpatest.entity.User;

import java.util.List;

public interface MyService {
    List<User> getAll();
    User getUser(int id);

}

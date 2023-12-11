package com.example.jpatest.repository;

import com.example.jpatest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<User, Integer> {

}

package com.example.jpatest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Phone {

    @Id
    @Column(name = "phone_id")
    private int phoneId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_name")
    private String userName;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user; 

}



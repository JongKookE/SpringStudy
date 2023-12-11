package com.example.jpatest.dto;

import lombok.*;

@Getter @Setter
@Builder
public class UserInfoDto {
    private int userId;
    private String password;
    private String email;
}

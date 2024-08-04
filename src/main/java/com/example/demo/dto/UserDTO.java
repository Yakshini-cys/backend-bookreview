package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String username;
    private String email;
    private String passwordHash;
    private String registrationDate;
    private String lastLoginDate;
}

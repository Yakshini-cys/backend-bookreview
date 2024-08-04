package com.example.demo.service;

import com.example.demo.dto.UserProfileDTO;

public interface UserProfileService {
    UserProfileDTO createUserProfile(UserProfileDTO userProfileDTO);
    UserProfileDTO getUserProfileById(Long profileId);
    UserProfileDTO updateUserProfile(Long profileId, UserProfileDTO userProfileDTO);
    void deleteUserProfile(Long profileId);
}

package com.example.demo.service.impl;

import com.example.demo.dto.UserProfileDTO;
import com.example.demo.entity.UserProfile;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserProfileDTO createUserProfile(UserProfileDTO userProfileDTO) {
        UserProfile userProfile = modelMapper.map(userProfileDTO, UserProfile.class);
        userProfile = userProfileRepository.save(userProfile);
        return modelMapper.map(userProfile, UserProfileDTO.class);
    }

    @Override
    public UserProfileDTO getUserProfileById(Long profileId) {
        UserProfile userProfile = userProfileRepository.findById(profileId)
                .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found"));
        return modelMapper.map(userProfile, UserProfileDTO.class);
    }

    @Override
    public UserProfileDTO updateUserProfile(Long profileId, UserProfileDTO userProfileDTO) {
        UserProfile existingProfile = userProfileRepository.findById(profileId)
                .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found"));
        
        modelMapper.map(userProfileDTO, existingProfile);
        existingProfile.setProfileId(profileId); // Ensure the ID is set correctly
        
        UserProfile updatedProfile = userProfileRepository.save(existingProfile);
        return modelMapper.map(updatedProfile, UserProfileDTO.class);
    }

    @Override
    public void deleteUserProfile(Long profileId) {
        UserProfile userProfile = userProfileRepository.findById(profileId)
                .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found"));
        userProfileRepository.delete(userProfile);
    }
}

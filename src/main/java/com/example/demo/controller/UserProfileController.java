package com.example.demo.controller;

import com.example.demo.dto.UserProfileDTO;
import com.example.demo.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userprofiles")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public ResponseEntity<UserProfileDTO> createUserProfile(@RequestBody UserProfileDTO userProfileDTO) {
        UserProfileDTO createdProfile = userProfileService.createUserProfile(userProfileDTO);
        return ResponseEntity.ok(createdProfile);
    }

    @GetMapping("/{profileId}")
    public ResponseEntity<UserProfileDTO> getUserProfileById(@PathVariable Long profileId) {
        UserProfileDTO userProfile = userProfileService.getUserProfileById(profileId);
        return ResponseEntity.ok(userProfile);
    }

    @PutMapping("/{profileId}")
    public ResponseEntity<UserProfileDTO> updateUserProfile(@PathVariable Long profileId, @RequestBody UserProfileDTO userProfileDTO) {
        UserProfileDTO updatedProfile = userProfileService.updateUserProfile(profileId, userProfileDTO);
        return ResponseEntity.ok(updatedProfile);
    }

    @DeleteMapping("/{profileId}")
    public ResponseEntity<Void> deleteUserProfile(@PathVariable Long profileId) {
        userProfileService.deleteUserProfile(profileId);
        return ResponseEntity.noContent().build();
    }
}

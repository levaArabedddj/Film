package com.example.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ActorProfileDto {
    private String biography;
    private String skills;
    private String languages;
    private String experience;
    private String profilePhotoUrl;

    public ActorProfileDto(String biography, String skills, String languages, String experience, String profilePhotoUrl) {
        this.biography = biography;
        this.skills = skills;
        this.languages = languages;
        this.experience = experience;
        this.profilePhotoUrl = profilePhotoUrl;
    }
}

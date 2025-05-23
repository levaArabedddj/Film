package com.example.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCrewMember {
    private long crewMember_id;
    private String name;
    private String surName;
    private int salaryPerHours;
}

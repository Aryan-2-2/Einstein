package com.keyo.DTO;

import com.keyo.entites.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDTO {
private String adminId;
private String name;
private String about;
private Gender gender;
}

package com.example.LMS.backend.RequestDTO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class StudentRequestDto
{
    private int age;

    @Column(nullable = false)
    private String name;

    private String country;

    @Column(nullable = false,unique = true)
    private String email;


}

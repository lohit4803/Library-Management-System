package com.example.LMS.backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(name = "email",unique = true,nullable = false)
    private String  email;

    private int age;
    private String country;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    public Student(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;

    }

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private card card1;
}

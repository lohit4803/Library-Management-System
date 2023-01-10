package com.example.LMS.backend.models;

import com.example.LMS.backend.Enums.cardStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "card")

public class card
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private cardStatus cardstatus;

    @OneToOne
    @JoinColumn
    private Student student;
}

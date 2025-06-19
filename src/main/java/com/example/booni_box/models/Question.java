package com.example.booni_box.models;

import jakarta.persistence.*;

@Entity(name = "Questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}

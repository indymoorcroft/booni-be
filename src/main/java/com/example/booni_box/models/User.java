package com.example.booni_box.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "user")
    private List<UserAnswer> userAnswers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }
}

package com.example.booni_box.models;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany(mappedBy = "answer")
    private List<UserAnswer> userAnswers;

    @OneToMany(mappedBy = "answer")
    private List<ProductScore> productScores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public List<ProductScore> getProductScores() {
        return productScores;
    }

    public void setProductScores(List<ProductScore> productScores) {
        this.productScores = productScores;
    }
}

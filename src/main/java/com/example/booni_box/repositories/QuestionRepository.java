package com.example.booni_box.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.booni_box.models.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}

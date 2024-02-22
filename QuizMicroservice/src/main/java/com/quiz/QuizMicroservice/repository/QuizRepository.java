package com.quiz.QuizMicroservice.repository;

import com.quiz.QuizMicroservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}

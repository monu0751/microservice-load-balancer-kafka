package com.quiz.QuizMicroservice.service;

import com.quiz.QuizMicroservice.model.Quiz;

import java.util.List;

public interface QuizService {
    Quiz createQuiz(Quiz quiz);
    List<Quiz> getAllQuiz();

    Quiz getQuiz(int id);
}

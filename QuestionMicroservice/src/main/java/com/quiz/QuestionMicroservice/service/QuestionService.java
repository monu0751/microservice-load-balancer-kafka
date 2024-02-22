package com.quiz.QuestionMicroservice.service;

import com.quiz.QuestionMicroservice.model.Question;

import java.util.List;

public interface QuestionService {
    public Question createQuestion(Question question);
    public List<Question> getAllQuestion();
    public List<Question> getAllQuestionByQuiz(int id);
    public Question getQuestion(int id);
}

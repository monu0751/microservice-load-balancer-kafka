package com.quiz.QuestionMicroservice.service.impl;

import com.quiz.QuestionMicroservice.model.Question;
import com.quiz.QuestionMicroservice.repository.QuestionRepository;
import com.quiz.QuestionMicroservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getAllQuestionByQuiz(int id) {
        return questionRepository.findQuestionsByQuizId(id);
    }

    @Override
    public Question getQuestion(int id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
    }
}

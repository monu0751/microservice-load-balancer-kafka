package com.quiz.QuizMicroservice.service.impl;

import com.quiz.QuizMicroservice.model.Quiz;
import com.quiz.QuizMicroservice.repository.QuizRepository;
import com.quiz.QuizMicroservice.service.QuestionClientService;
import com.quiz.QuizMicroservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionClientService questionClientService;
    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizzes = quizRepository.findAll();
        List<Quiz> newQuizList = quizzes.stream().map(quiz->{
            quiz.setQuestions(questionClientService.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).toList();
        return newQuizList;
    }

    @Override
    public Quiz getQuiz(int id) {
        Quiz quiz =quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClientService.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}

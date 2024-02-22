package com.quiz.QuizMicroservice.service;

import com.quiz.QuizMicroservice.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8082",value = "Question-Client")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClientService {
    @GetMapping("/question/byQuiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable int quizId);
}

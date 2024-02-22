package com.quiz.QuizMicroservice.controller;

import com.quiz.QuizMicroservice.model.Quiz;
import com.quiz.QuizMicroservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping
    public ResponseEntity<Quiz> create(@RequestBody Quiz quiz){
        Quiz quiz1 = quizService.createQuiz(quiz);
        return new ResponseEntity<>(quiz1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getAll(){
        List<Quiz> quizList = quizService.getAllQuiz();
        return new ResponseEntity<>(quizList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Quiz> get(@PathVariable int id){
        Quiz quiz = quizService.getQuiz(id);
        return new ResponseEntity<>(quiz, HttpStatus.OK);
    }

}

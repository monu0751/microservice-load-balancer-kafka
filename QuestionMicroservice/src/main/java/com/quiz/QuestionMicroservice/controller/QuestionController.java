package com.quiz.QuestionMicroservice.controller;

import com.quiz.QuestionMicroservice.model.Question;
import com.quiz.QuestionMicroservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public ResponseEntity<Question> create(@RequestBody Question question){
        Question question1 = questionService.createQuestion(question);
        return new ResponseEntity<>(question1, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable int id){
        Question question = questionService.getQuestion(id);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Question>> getAllQuestion(){
        List<Question> questions = questionService.getAllQuestion();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping("/byQuiz/{id}")
    public ResponseEntity<List<Question>> getAllQuestionByQuiz(@PathVariable int id){
        List<Question> questions = questionService.getAllQuestionByQuiz(id);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }


}

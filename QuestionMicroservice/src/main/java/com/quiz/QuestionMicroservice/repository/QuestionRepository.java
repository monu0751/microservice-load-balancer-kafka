package com.quiz.QuestionMicroservice.repository;

import com.quiz.QuestionMicroservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    public List<Question> findQuestionsByQuizId(int quizId);

}

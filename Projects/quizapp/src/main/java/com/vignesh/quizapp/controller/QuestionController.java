package com.vignesh.quizapp.controller;

import com.vignesh.quizapp.model.Question;
import com.vignesh.quizapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/addquestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        String response = questionService.addQuestion(question);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/removequestion/{id}")
    public ResponseEntity<String> deleteQuestionById(@PathVariable int id) {
        String response = questionService.deleteQuestionById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

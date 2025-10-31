package com.vignesh.quizapp.services;

import com.vignesh.quizapp.model.Question;
import com.vignesh.quizapp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public String addQuestion(Question question) {
        questionRepo.save(question);
        return "Question added";
    }

    public String deleteQuestionById(int id) {
        questionRepo.deleteById(id);
        return "Question deleted with id: " + id;
    }
}

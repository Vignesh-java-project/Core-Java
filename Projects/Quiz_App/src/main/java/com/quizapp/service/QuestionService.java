package com.quizapp.service;

import com.quizapp.model.Question;
import com.quizapp.repository.QuestionRepo;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    private QuestionRepo questionRepo = new QuestionRepo();

    public QuestionService() {
    }

    public void PrintAllQuestions() {
        for(Question question : this.questionRepo.getAllQuestions()) {
            question.printQuestion();
        }

    }

    public void getQuestionById(int id) {
        Question question = (Question)this.questionRepo.Questions.get(id - 1);
        question.printQuestion();
    }

    public void getQuestionsByCategory(String category) {
        List<Question> questions = new ArrayList();

        for(Question question : this.questionRepo.Questions) {
            if (question.getCategory().equals(category)) {
                questions.add(question);
            }
        }

        for(Question question : questions) {
            question.printQuestion();
        }

    }
}

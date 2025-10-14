package com.quizapp.repository;

import com.quizapp.model.Question;
import java.util.Arrays;
import java.util.List;

public class QuestionRepo {
    public List<Question> Questions = Arrays.asList(new Question(1, "Which of this keyword can be used in a subclass to call the constructor of superclass?", "super", "this", "extends", "implements", "super", "easy"), new Question(2, "Which of these keywords can be used to prevent Method overriding", "static", "final", "constant", "protected", "final", "medium"), new Question(3, " Which of the following is not OOPS concept in Java?", "Inheritance", "Encapsulation", "Polymorphism", "Compilation", "Compilation", "easy"), new Question(4, "Which of these data type value is returned by equals() method of String class?", "int", "boolean", "char", "string", "boolean", "hard"));

    public QuestionRepo() {
    }

    public List<Question> getAllQuestions() {
        return this.Questions;
    }

    public String AddQuestion(Question question) {
        this.Questions.add(question);
        return "Successfully added question";
    }

    public String DeleteQuestion(int questionID) {
        this.Questions.remove(questionID);
        return "Successfully deleted question";
    }

    public String UpdateQuestion(Question question) {
        int index = this.Questions.indexOf(question);
        this.Questions.set(index, question);
        return "Successfully updated question";
    }
}
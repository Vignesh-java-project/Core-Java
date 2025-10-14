package com.quizapp.model;

public class Question {
    private int questionId;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String category;

    public Question(int questionId, String question, String option1, String option2, String option3, String option4, String answer, String category) {
        this.questionId = questionId;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.category = category;
    }

    public int getQuestionId() {
        return this.questionId;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getOption1() {
        return this.option1;
    }

    public String getOption2() {
        return this.option2;
    }

    public String getOption3() {
        return this.option3;
    }

    public String getOption4() {
        return this.option4;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getCategory() {
        return this.category;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printQuestion() {
        System.out.println(this.questionId + "  " + this.question);
        System.out.println("       Option 1: " + this.option1);
        System.out.println("       Option 2: " + this.option2);
        System.out.println("       Option 3: " + this.option3);
        System.out.println("       Option 4: " + this.option4);
        System.out.println();
    }
}
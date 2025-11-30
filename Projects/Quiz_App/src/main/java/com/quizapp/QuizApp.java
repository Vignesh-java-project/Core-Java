package com.quizapp;

import com.quizapp.view.DashBoard;

public class QuizApp {
    static DashBoard dashBoard = new DashBoard();

    public QuizApp() {
    }

    public static void main(String[] args) {
        dashBoard.printDashBoard();
    }
}
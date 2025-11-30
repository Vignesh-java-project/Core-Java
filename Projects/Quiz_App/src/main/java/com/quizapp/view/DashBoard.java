package com.quizapp.view;

import com.quizapp.service.QuestionService;
import java.util.Scanner;

public class DashBoard {
    public DashBoard() {
    }

    public void printDashBoard() {
        QuestionService questionService = new QuestionService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hai Welcome to Quiz App");
        boolean willing = true;

        while(willing) {
            System.out.println("This is a DashBoard of an Application");
            System.out.println("1. Get All Questions");
            System.out.println("2. Get Question By ID");
            System.out.println("3. Get Question By Category");
            System.out.println("4. Exit");
            System.out.println("Please Enter Your Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    questionService.PrintAllQuestions();
                    break;
                case 2:
                    System.out.println("Enter Question ID");
                    int questionId = scanner.nextInt();
                    questionService.getQuestionById(questionId);
                    break;
                case 3:
                    System.out.println("Enter Category");
                    String category = scanner.next();
                    questionService.getQuestionsByCategory(category);
                case 4:
            }

            System.out.println("are you want to exit? (Y/N)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("y")) {
                willing = false;
            }
        }

    }
}

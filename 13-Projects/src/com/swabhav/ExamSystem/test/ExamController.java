package com.swabhav.ExamSystem.test;

import java.util.Scanner;

import com.swabhav.ExamSystem.model.ExamEvaluator;
import com.swabhav.ExamSystem.model.OnlineQuiz;
import com.swabhav.ExamSystem.model.PracticalExam;
import com.swabhav.ExamSystem.model.TheoryExam;
import com.swabhav.ExamSystem.model.Validator;

public class ExamController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Exam Evaluation System ===");

        boolean continueEvaluation;

        do {
            // Step 1: Ask user which exam they want to evaluate
            String examType = Validator.getValidatedExamType();
            ExamEvaluator evaluator = null;

            // Step 2: Initialize appropriate class using polymorphism
            switch (examType) {
                case "theory":
                    evaluator = new TheoryExam();
                    break;
                case "practical":
                    evaluator = new PracticalExam();
                    break;
                case "online":
                    evaluator = new OnlineQuiz();
                    break;
            }

            // Step 3: Get marks and evaluate
            double marks = Validator.getValidatedMarks();
            evaluator.evaluateMarks(marks);
            System.out.println(evaluator.calculateGrade());

            // Step 4: Ask user if they want to evaluate another exam
            continueEvaluation = Validator.getYesNoInput("\nDo you want to evaluate another exam? (yes/no): ");

        } while (continueEvaluation);

        System.out.println("Thank you for using the Exam Evaluation System!");
    }
}

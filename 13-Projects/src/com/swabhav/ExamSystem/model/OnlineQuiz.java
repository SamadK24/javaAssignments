package com.swabhav.ExamSystem.model;

public class OnlineQuiz implements ExamEvaluator {
    private double marks;
    private String grade;

    @Override
    public void evaluateMarks(double marks) {
        this.marks = marks;
        if (marks >= 80) grade = "Pass with Distinction";
        else if (marks >= 50) grade = "Pass";
        else grade = "Fail";
    }

    @Override
    public String calculateGrade() {
        return "Online Quiz Result: " + grade;
    }
}

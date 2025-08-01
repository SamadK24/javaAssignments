package com.swabhav.ExamSystem.model;

public class PracticalExam implements ExamEvaluator {
    private double marks;
    private String grade;

    @Override
    public void evaluateMarks(double marks) {
        this.marks = marks;
        if (marks >= 85) grade = "Excellent";
        else if (marks >= 70) grade = "Very Good";
        else if (marks >= 50) grade = "Good";
        else grade = "Fail";
    }

    @Override
    public String calculateGrade() {
        return "Practical Exam Grade: " + grade;
    }
}

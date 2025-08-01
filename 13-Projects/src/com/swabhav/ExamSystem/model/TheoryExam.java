package com.swabhav.ExamSystem.model;

public class TheoryExam implements ExamEvaluator {
    private double marks;
    private String grade;

    @Override
    public void evaluateMarks(double marks) {
        this.marks = marks;
        if (marks >= 90) grade = "A+";
        else if (marks >= 75) grade = "A";
        else if (marks >= 60) grade = "B";
        else if (marks >= 45) grade = "C";
        else grade = "F";
    }

    @Override
    public String calculateGrade() {
        return "Theory Exam Grade: " + grade;
    }
}

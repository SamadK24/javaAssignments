package com.swabhav.ExamSystem.model;

public interface ExamEvaluator {
    void evaluateMarks(double marks);
    String calculateGrade();
}

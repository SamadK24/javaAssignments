package com.swabhav.ExamService.ISP.model;

public class Teacher implements ITeacher {

	
	public Teacher() {
		
	}
	@Override
	public void startExam() {
		System.out.println("Start exam");
		
	}

	@Override
	public void gradeExam() {

        System.out.println("Exam is graded");
		
	}

	@Override
	public void createQuestionBank() {
		System.out.println("Question Bank created");
		
	}

	@Override
	public void endExam() {
		System.out.println("Exam is ended");
		
	}
	
	

}

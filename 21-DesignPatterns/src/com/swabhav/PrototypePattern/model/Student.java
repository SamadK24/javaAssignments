package com.swabhav.PrototypePattern.model;

public class Student implements Cloneable {
    private String name;
    private String course;
    private int fees;

    public Student(String course, int fees) {
        this.course = course;
        this.fees = fees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

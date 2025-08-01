package com.swabhav.PrototypePattern.test;

import com.swabhav.PrototypePattern.model.Student;
import com.swabhav.PrototypePattern.model.StudentRegistry;

public class PrototypeTest {
    public static void main(String[] args) {
        Student baseStudent = new Student("Java Course", 10000);
        StudentRegistry registry = new StudentRegistry(baseStudent);

        Student s1 = registry.getClonedStudent();
        s1.setName("Alice");

        Student s2 = registry.getClonedStudent();
        s2.setName("Bob");

        s1.showDetails();
        System.out.println();
        s2.showDetails();
        
    }
}

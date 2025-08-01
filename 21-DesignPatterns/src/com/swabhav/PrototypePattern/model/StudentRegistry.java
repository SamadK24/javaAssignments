package com.swabhav.PrototypePattern.model;

public class StudentRegistry {
    private Student prototype;

    public StudentRegistry(Student prototype) {
        this.prototype = prototype;
    }

    public Student getClonedStudent() {
        return prototype.clone();
    }
}

package com.swabhav.consumer.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentPredicateEgTest {
public static void main(String[] args) {
	
	List<StudentPredicateEg> students= Arrays.asList(
            new StudentPredicateEg("Alice", 35),
            new StudentPredicateEg("Bob", 75),
            new StudentPredicateEg("Charlie", 40),
            new StudentPredicateEg("Diana", 28),
            new StudentPredicateEg("Ethan", 90)
        );
    // Predicate to check if marks are >= 40
    Predicate<StudentPredicateEg> isPassing = s -> s.marks >= 40;

    // Print passing students using .test()
    for (StudentPredicateEg s : students) {
        if (isPassing.test(s)) {
            System.out.println(s);
        }
    }
}
}

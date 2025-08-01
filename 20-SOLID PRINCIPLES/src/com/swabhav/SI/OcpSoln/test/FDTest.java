package com.swabhav.SI.OcpSoln.test;


import java.util.Scanner;

import com.swabhav.SI.OcpSoln.model.DiwaliInterest;
import com.swabhav.SI.OcpSoln.model.FixedDeposit;
import com.swabhav.SI.OcpSoln.model.HoliInterest;
import com.swabhav.SI.OcpSoln.model.IFestivalInterest;

public class FDTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter Name: ");
        String name = scanner.next();

        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Duration (in years): ");
        int duration = scanner.nextInt();

        System.out.println("Choose Festival Type:");
        System.out.println("1. Diwali");
        System.out.println("2. Holi");
        System.out.println("3. New Year");
        System.out.println("4. Others");
        int choice = scanner.nextInt();

        IFestivalInterest interest = null;

        switch (choice) {
            case 1:
                interest = new DiwaliInterest();
                break;
            case 2:
                interest = new HoliInterest();
                break;
            case 3:
                interest = () -> 8.0; // Using lambda for New Year
                break;
            case 4:
                interest = () -> 6.5; // Using lambda for Others
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Others.");
                interest = () -> 6.5;
        }

        FixedDeposit fd = new FixedDeposit(accountNumber, name, principal, duration, interest);
        System.out.println("Simple Interest: " + fd.calculateSimpleInterest());

        scanner.close();
    }
}


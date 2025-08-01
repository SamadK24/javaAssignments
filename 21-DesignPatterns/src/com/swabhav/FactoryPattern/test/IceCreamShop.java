package com.swabhav.FactoryPattern.test;

import java.util.Scanner;

import com.swabhav.FactoryPattern.model.IIcecream;
import com.swabhav.FactoryPattern.model.IceCreamFactory;

public class IceCreamShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCreamFactory factory = new IceCreamFactory();

        System.out.println("Enter flavor (Vanilla / Chocolate / Strawberry): ");
        String choice = sc.nextLine();

        IIcecream iceCream = factory.getIceCream(choice);

        if (iceCream != null) {
            iceCream.prepare();
        } else {
            System.out.println("Sorry, we don't have that flavor.");
        }

        sc.close();
    }
}

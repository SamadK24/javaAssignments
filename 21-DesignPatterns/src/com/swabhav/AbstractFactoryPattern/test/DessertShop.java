package com.swabhav.AbstractFactoryPattern.test;

import java.util.Scanner;

import com.swabhav.AbstractFactoryPattern.model.Cone;
import com.swabhav.AbstractFactoryPattern.model.ConeFactory;
import com.swabhav.AbstractFactoryPattern.model.DessertFactory;
import com.swabhav.AbstractFactoryPattern.model.IceCream;
import com.swabhav.AbstractFactoryPattern.model.IceCreamFactory;

public class DessertShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choosing ice cream
        DessertFactory iceCreamFactory = new IceCreamFactory();
        System.out.println("Choose ice cream (vanilla/chocolate):");
        String flavor = sc.nextLine();

        IceCream iceCream = iceCreamFactory.createIceCream(flavor);
        if (iceCream != null) {
            iceCream.prepare();
        } else {
            System.out.println("Invalid flavor.");
        }

        // Choosing cone
        DessertFactory coneFactory = new ConeFactory();
        System.out.println("Choose cone (waffle/sugar):");
        String coneType = sc.nextLine();

        Cone cone = coneFactory.createCone(coneType);
        if (cone != null) {
            cone.make();
        } else {
            System.out.println("Invalid cone type.");
        }

        sc.close();
        
    }
}

package com.swabhav.SI.OcpViolation.test;

import com.swabhav.SI.OcpViolation.model.FestivalType;
import com.swabhav.SI.OcpViolation.model.FixedDeposit;

public class FDTest {
public static void main(String[] args) {

    FixedDeposit fd = new FixedDeposit(101, "Amit", 10000, 2, FestivalType.DIWALI);
    System.out.println("Simple Interest: " + fd.calculateSimpleInterest());

}
}

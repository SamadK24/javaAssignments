package com.swabhav.oops.test;

import com.swabhav.oops.model.EmployeeBonusValidatorModel;

public class EmployeeBonusValidator {
public static void main(String[] args) {
	
	EmployeeBonusValidatorModel emp1 = new EmployeeBonusValidatorModel();
	
	emp1.setname("Samad");
	emp1.setsalary(15000);
	emp1.setbonus(1000);
	emp1.DisplayBonus();
	
	
}
}

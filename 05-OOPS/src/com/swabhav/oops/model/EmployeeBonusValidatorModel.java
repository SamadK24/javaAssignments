package com.swabhav.oops.model;

public class EmployeeBonusValidatorModel {
private String name;
private double salary;
private double bonus;

public String getname() {
	return name;
}

public double getsalary() {
	return salary;
}

public void setname(String name) {
	this.name=name;
}

public void setsalary(double salary) {
	this.salary=salary;
}

public void setbonus(double bonus) {
	this.bonus=bonus;
}

public void DisplayBonus() {
	double finalSalary=0;
	
	if(bonus<=0.2*salary) {
		finalSalary=salary+bonus;
	}
	
	System.out.println("Your salary is "+salary);
	System.out.println("Your final salary is "+finalSalary);
}

}

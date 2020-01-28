package com.techelevator;

public class SalaryWorker implements Worker {

	private String firstName;
	private String lastName;
	private double annualSalary;
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}
	
	@Override
	public String getName() {
		return this.lastName + ", " + this.firstName;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		return annualSalary/52;
	}
	
	

}

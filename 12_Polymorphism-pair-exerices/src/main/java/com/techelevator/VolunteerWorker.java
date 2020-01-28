package com.techelevator;

public class VolunteerWorker implements Worker {

	private String firstName;
	private String lastName;
	
	public VolunteerWorker(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String getName() {
		return this.lastName + ", " + this.firstName;
	}

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		 return hoursWorked * 0;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	
}

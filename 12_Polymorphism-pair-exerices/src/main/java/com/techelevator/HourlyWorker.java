package com.techelevator;

public class HourlyWorker implements Worker {
	
	double hourlyRate;
	String firstName;
	String lastName;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
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
	public String getName() {
		return this.lastName + ", " + this.firstName;
	}
	
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		
		double pay = hourlyRate*hoursWorked;
		
		if (hoursWorked <= 40) {
			return pay;
		}else {
			double overtime = hoursWorked-40;
			return pay + (hourlyRate*overtime*.5);
		}
		
	}

}

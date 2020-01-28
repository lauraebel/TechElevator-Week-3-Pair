package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class PayCalculator {

	public static void main(String[] args) {
		
		
		List<Worker> pay = new ArrayList<Worker>();
		
		Worker volunteerWorker = new VolunteerWorker("Carla", "Barr");
		Worker salaryWorker = new SalaryWorker("Jim", "Jones", 50000);
		Worker hourlyWorker = new HourlyWorker("Jacob", "Jacobs", 15);
		
		pay.add(volunteerWorker);
		pay.add(salaryWorker);
		pay.add(hourlyWorker);
		
		double totalHours = 0;
		double totalPay = 0;
		
		System.out.printf("%s %30s %25s", "Employee","Hours Worked", "Pay");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");

		for (Worker worker : pay) {
			//do stuff
			//and things
			//figure out weekly pay
			int randomHoursWorked = (int) (Math.random() * ((140 - 10) + 1)) + 10;
			double weeklyPay = worker.calculateWeeklyPay(randomHoursWorked);
			System.out.printf("%-30s %-30d %-1s%.2f\n", worker.getName(), randomHoursWorked, "$", weeklyPay);
			
			totalHours+=randomHoursWorked;
			totalPay+=weeklyPay;
			
		}
		
		System.out.println();
		System.out.println("Total Hours: " + totalHours);
		System.out.printf("Total Pay: $%.2f", totalPay);

	}

}

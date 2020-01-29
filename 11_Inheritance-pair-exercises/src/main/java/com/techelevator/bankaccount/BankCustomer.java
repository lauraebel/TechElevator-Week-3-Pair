package com.techelevator.bankaccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

	private String name;
	private String address;
	private String phoneNumber;
	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public boolean isVIP() {
		
		BigDecimal totalBalance = new BigDecimal(0);
		
		for (BankAccount account : accounts) {
			System.out.println(account.getBalance());
			totalBalance = totalBalance.add(account.getBalance());
		}
		
		if ( totalBalance.compareTo(new BigDecimal(25000)) == 0 
				|| totalBalance.compareTo(new BigDecimal(25000)) == 1) {
			return true;
		}
		
		return false;
		
	}
	
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}
	
	
}

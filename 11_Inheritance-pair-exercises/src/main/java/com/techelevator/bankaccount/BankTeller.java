package com.techelevator.bankaccount;

import java.math.BigDecimal;

public class BankTeller {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		
		account.deposit(new BigDecimal(24));
		
		System.out.println(account.getBalance());
		
		account.withdraw(new BigDecimal(7));
		System.out.println(account.getBalance());
		
		BankAccount accountTwo = new BankAccount();
		
		accountTwo.deposit(new BigDecimal(300));
		
		accountTwo.transfer(account, new BigDecimal(100));
		System.out.println(account.getBalance());
		System.out.println(accountTwo.getBalance());

		
		
	}

}

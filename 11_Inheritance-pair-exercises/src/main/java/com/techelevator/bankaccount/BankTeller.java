package com.techelevator.bankaccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankTeller {

	public static void main(String[] args) {
		//testing BankAccount
		BankAccount account = new CheckingAccount();
		//deposit
		account.deposit(new BigDecimal(24));
		System.out.println(account.getBalance());
		//and withdraw
		account.withdraw(new BigDecimal(7));
		System.out.println(account.getBalance());
		//and transfer
		BankAccount accountTwo = new CheckingAccount();
		accountTwo.deposit(new BigDecimal(300));
		accountTwo.transfer(account, new BigDecimal(100));
		System.out.println(account.getBalance());
		System.out.println(accountTwo.getBalance());

		//testing CheckingAccount
		CheckingAccount cAccount = new CheckingAccount();
		cAccount.withdraw(new BigDecimal(101));
		System.out.println(cAccount.getBalance());
		
		//testing SavingsAccount
		SavingsAccount sAccount = new SavingsAccount();
		sAccount.withdraw(new BigDecimal(50));
		System.out.println(sAccount.getBalance());
		sAccount.deposit(new BigDecimal(100));
		sAccount.withdraw(new BigDecimal(20));
		System.out.println(sAccount.getBalance());
		
		//testing BankCustomer
		BankCustomer johnDoe = new BankCustomer();
		johnDoe.addAccount(new SavingsAccount());
		johnDoe.addAccount(new CheckingAccount());
		sAccount.deposit(new BigDecimal(26000));
		johnDoe.addAccount(sAccount);
		
		
		System.out.print(String.format("John Doe has %s accounts.", johnDoe.getAccounts().size()));
		boolean isVIP = johnDoe.isVIP();
		System.out.println("\nIs John Doe a VIP? " + johnDoe.isVIP());
		
	
	}

}

package com.techelevator.bankaccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankTeller {

	public static void main(String[] args) {
		//testing BankAccount
		BankAccount account = new BankAccount();
		//deposit
		account.deposit(new BigDecimal(24));
		System.out.println(account.getBalance());
		//and withdraw
		account.withdraw(new BigDecimal(7));
		System.out.println(account.getBalance());
		//and transfer
		BankAccount accountTwo = new BankAccount();
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
		System.out.print(String.format("John Doe has %s accounts.", johnDoe.getAccounts().size()));
		
	
	}

}

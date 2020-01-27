package com.techelevator.bankaccount;

import java.math.BigDecimal;

public class BankAccount {

	public BankAccount () {
	}

	private String accountNumber;
	private BigDecimal balance = new BigDecimal(0);
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		setBalance(this.balance.add(amountToDeposit));
		return this.balance;
	}

	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		setBalance(this.balance.subtract(amountToWithdraw));
		return this.balance;
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	private void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}

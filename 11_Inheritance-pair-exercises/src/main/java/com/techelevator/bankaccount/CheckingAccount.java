package com.techelevator.bankaccount;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount() {
		super();
	}

//	A CheckingAccount "is-a" BankAccount, but also has some additional rules:
//
//		Override      Description
	//  Method	
	//
//		withdraw	If the balance falls below $0.00 a $10.00 overdraft fee is also withdrawn from the account.
//		withdraw	Checking account cannot be more than $100.00 overdrawn. If a withdrawal is requested leaving the account more than 
//		            $100.00 overdrawn, it fails and the balance remains the same.
	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		BigDecimal potentialBalance = getBalance().subtract(amountToWithdraw);
		if (potentialBalance.compareTo(new BigDecimal(0)) == -1 && (potentialBalance.compareTo(new BigDecimal(-100)) == 1)) {
			super.withdraw(amountToWithdraw.subtract(new BigDecimal(10)));
			return super.getBalance();
		} else if (potentialBalance.compareTo(new BigDecimal(-100)) == -1) {
			System.out.println("Withdrawl Failed");
			return super.getBalance();
		} else {
			super.withdraw(amountToWithdraw);
			return super.getBalance();
		}
	}
}

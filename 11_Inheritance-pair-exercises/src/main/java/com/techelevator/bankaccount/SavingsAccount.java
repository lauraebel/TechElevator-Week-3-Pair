package com.techelevator.bankaccount;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

	public SavingsAccount() {
		super();
	}

	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		if (amountToWithdraw.compareTo(getBalance()) == 1){
			System.out.println("Withdraw Failed");
		}else if (getBalance().compareTo(new BigDecimal(150)) == -1){
			super.withdraw(amountToWithdraw.add(new BigDecimal(2)));
		} else {
			super.withdraw(amountToWithdraw);
		}
		
		return getBalance();
	}
}

package com.techelevator.bankaccount;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount() {
		super();
	}

	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		BigDecimal potentialBalance = getBalance().subtract(amountToWithdraw);
		if (potentialBalance.compareTo(new BigDecimal(0)) == -1 && (potentialBalance.compareTo(new BigDecimal(-100)) == 1)) {
			super.withdraw(amountToWithdraw.add(new BigDecimal(10)));
		} else if (potentialBalance.compareTo(new BigDecimal(-100)) == -1) {
			System.out.println("Withdrawl Failed");
		} else {
			super.withdraw(amountToWithdraw);
		}
		
		return getBalance();
	}
}

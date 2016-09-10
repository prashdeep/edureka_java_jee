package com.edureka.java_jee.module_4;

public class ExceptionCallee {

	public int divide(int input1, int input2) throws Exception {
		int result = 0;
		try {
			result = input1 / input2;
		} catch (ArithmeticException e) {
			System.out.println("Threw exception because the divisor was 0 ");
			throw new Exception("Invalid input");
		}

		return result;
	}

	public double withdraw(int accounNo, double amount) throws InsufficientBalanceException {
		double amt = 0.0;
		// fetch the account balance for the acc No.
		double amtInAcc = 45000;
		if (amount < amtInAcc) {
			amtInAcc = amtInAcc - amount;
			return amount;
		} else {
			throw new InsufficientBalanceException("Insufficient funds in your account: "+amount);
		}
	}

}

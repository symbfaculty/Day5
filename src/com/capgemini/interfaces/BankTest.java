package com.capgemini.interfaces;

public class BankTest {

	public static void main(String[] args) {
	   Banking banking = new SavingsAccount(101, "Anita", 5000);
	   int otp =banking.generateOTP();
	   System.out.println(" otp "+otp);

	}

}

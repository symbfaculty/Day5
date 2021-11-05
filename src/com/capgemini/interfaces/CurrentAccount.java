package com.capgemini.interfaces;

public class CurrentAccount extends Account{
        private int overdraftLimit;

		public CurrentAccount(int acno, String name, float balance, int overdraftLimit) {
			super(acno, name, balance);
			this.overdraftLimit = overdraftLimit;
		}

		public int getOverdraftLimit() {
			return overdraftLimit;
		}

		public void setOverdraftLimit(int overdraftLimit) {
			this.overdraftLimit = overdraftLimit;
		}

		@Override
		public void deposit(float amount) {
		
		}

		@Override
		public void withdraw(float amount) {
			
			
		}
        
}

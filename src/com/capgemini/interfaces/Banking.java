package com.capgemini.interfaces;

public interface Banking {
    void deposit(float amount);
    void withdraw(float amount);
    default int generateOTP() {
    	double value=(Math.random())*10000;
    	int otp= (int)value;
    	return otp;
    }
}

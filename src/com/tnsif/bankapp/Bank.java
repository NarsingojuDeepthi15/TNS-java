package com.tnsif.bankapp;

public interface Bank {
	int min_balance=1000;
	int deposite_limit=25000;
	
	void deposite(Account account,double amount);
	void withdrawl(Account account,double amount);

}

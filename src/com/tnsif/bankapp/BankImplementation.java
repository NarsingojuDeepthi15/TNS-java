package com.tnsif.bankapp;

public class BankImplementation implements Bank{
	public void deposite(Account account,double amount) {
		if(amount>deposite_limit) {
			System.out.println("the deposite is not possible");
		}else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("the deposite is possible");
		}
	}
	public void withdrawl(Account account, double amount) {
		if(account.getBalance()>amount) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("The transaction is successfull");
			
		}else {
			System.out.println("The insufficient fund");
		}
	}
	
}

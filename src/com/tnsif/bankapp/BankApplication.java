package com.tnsif.bankapp;

public class BankApplication {
	public static void main(String[] args) {
		Bank bank=new BankImplementation();
		Account account=new Account(1234,"Sam",5000,bank);
		bank.deposite(account, 5000);
		bank.withdrawl(account, 3000);
		account.Hello();
	}

}

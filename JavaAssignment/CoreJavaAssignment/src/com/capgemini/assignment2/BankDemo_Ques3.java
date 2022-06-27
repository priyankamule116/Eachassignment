package com.capgemini.assignment2;

class BankAccount {
    
	private String name;
	protected double balance;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(double amount) {
		if(balance>amount) {
			balance -= amount;
			return true;
		}else {
			return false;
		}
	}
}
class CurrentAccount extends BankAccount{
	//overriding method
	public boolean withdraw(double amount) {
		balance -= amount;
		return true;
	}
}
class SavingAccount extends BankAccount{
	
	//method overriding
	@Override
	public boolean withdraw(double amount) {
		balance -= amount;
		return true;
	}
}
public class BankDemo_Ques3{
	public static void main(String[] args) {
		CurrentAccount cacc=new CurrentAccount();
		SavingAccount save=new SavingAccount();
		cacc.deposite(500.00);
		save.deposite(500.00);
	
	}
	public static void doWithdrawal(BankAccount acc) {
		boolean result=acc.withdraw(1000.00);
		if(result) {
			System.out.println("Withdrawc Succeed");
		}else {
			System.out.println("Withdraw failed");
		}
	}
	
}

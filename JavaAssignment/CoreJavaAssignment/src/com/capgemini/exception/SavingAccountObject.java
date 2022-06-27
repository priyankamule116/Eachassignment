package com.capgemini.exception;

public class SavingAccountObject {
    
	long id;
	double balance=10000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             SavingAccountObject sao=new SavingAccountObject();
             //sao.withdraw(10);
             System.out.println();
	}
	double withdraw(double amount) {
		try {
			if(amount>balance) {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
		}catch (InsufficientBalanceException  e) {
		  e.printStackTrace();
		}
		return balance;
	}
	double deposit(double amount)
	{
		
		try {
			if(amount==(-10))
			{
				throw new IllegalBankTransactionException("Please enter correct amount");
			}
		}catch(IllegalBankTransactionException il)
		{
			il.printStackTrace();
		}
		return amount;
	}

}

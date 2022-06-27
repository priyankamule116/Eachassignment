package com.capgemini.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Throwable {

	public InsufficientBalanceException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}    
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception{

	public IllegalBankTransactionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	
	}
	
}
package com.capgemini.assignment1;

import java.util.Scanner;
//Find out simple and compound interest
public class SimpleandCompoundInterest {
    //Main Method
	//execution start from main method
	public static void main(String[] args) {
		//Taking input from users
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		double n1=sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter the time: ");
		double t=sc.nextDouble();
	    
		double interest = (n1 * t * rate) / 100;

	    System.out.println("Principal: " + n1);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + t);
	    System.out.println("Simple Interest: " + interest);

}
}
package com.capgemini.exception;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		//Taking input from scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your two numbers: ");
		int numberOne=sc.nextInt();
		int numberTwo=sc.nextInt();
		//Using try catch block we can handle the exception
		try {
			int result=numberOne/numberTwo;
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("Number can not be divided by zero");
		}
		sc.close();
		

	}

}

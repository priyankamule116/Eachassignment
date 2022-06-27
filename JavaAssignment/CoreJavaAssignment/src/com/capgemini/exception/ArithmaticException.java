package com.capgemini.exception;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		// Taking input from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// try catch block 
		int res;
		res = n1 / n2;
		System.out.println(res);
		System.out.println("Number can not be divided by Zero");
		sc.close();

	}

}

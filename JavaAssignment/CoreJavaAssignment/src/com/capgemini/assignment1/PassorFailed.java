package com.capgemini.assignment1;

import java.util.Scanner;

public class PassorFailed {

	public static void main(String[] args) {
		//Taking input from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sub1 marks: ");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter sub2 marks: ");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter sub3 marks: ");
		int sub3 = sc.nextInt();
		
		//conditions
		if (sub1 >= 60 && sub2 >= 60 && sub3 >= 60) {
			System.out.println("The student is passed");
		} else if (sub1 >= 60 && sub2 >= 60 && sub3 < 60) {
			System.out.println("The Student is promoted");
		} else if (sub1 >= 60 && sub2 < 60 && sub3 < 60) {
			System.out.println("The Student is failed");
		}

	}

}

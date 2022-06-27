package com.capgemini.assignment1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		//Taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income");
		double income=sc.nextInt();
		/*checking conditions based on income 
		 * by implementing the 
		 * conditional statments 
		*/
		if(income>=0&&income<=180000)
		{
			System.out.println("Slab => Slab A ");
			System.out.println("Tax Payable => Nill");
		}
		else if(income>=181001&income<=300000)
		{
			System.out.println("Slab => Slab B ");
			System.out.println("Tax Payable => 10%");
		}
		else if(income>=300001&income<=500000)
		{
			System.out.println("Slab => Slab C ");
			System.out.println("Tax Payable => 20%");
		}
		else if(income>=500001&income<=1000000)
		{
			System.out.println("Slab => Slab D ");
			System.out.println("Tax Payable => 30%");
		}
		else
		{
			//If not a valid input then this will be print
			System.out.println("Please Enter valid incomes");
		}
		sc.close();
	}

}
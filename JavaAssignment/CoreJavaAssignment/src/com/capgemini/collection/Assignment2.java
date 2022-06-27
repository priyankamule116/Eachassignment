package com.capgemini.collection;

import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int att=9;
		HashSet<String> hash=new HashSet<String>();
		//HashSet is the class which rejects duplicates
		//for loop helps in taking data for 10 times
		System.out.println("Enter your product names: ");
		for(int i=0;i<=att;i++)
		{
			//Taking i/p from user and storing in hashSet
			String ss=sc.next();
			hash.add(ss);
		}
		//First way of Retrieving using Syso
		System.out.println(hash);
		for(String res:hash)
		{
			//Second Way of retrieving 
			System.out.println(res);
		}
		sc.close();
	}

}

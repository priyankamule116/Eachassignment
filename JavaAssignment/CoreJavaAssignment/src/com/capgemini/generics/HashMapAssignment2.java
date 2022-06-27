package com.capgemini.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapAssignment2 {

	public static void main(String[] args) {
		//Creation of object of map
		Map<Integer, Double> hashmap=new HashMap<>();
		
		//Creation of object of scanner class
		Scanner sc=new Scanner(System.in);
		//It is ask for users to enter the input
		System.out.println("Enter limit");
		int limit=9;
		
		//using for loop we can add the values in the map
		for(int i=0;i<=limit;i++) {
			int number=sc.nextInt();
			double dd=sc.nextDouble();
			//Taking the key value from user and passing the values
			hashmap.put(number, dd);
		}
		
		Set<Entry<Integer,Double>> ss=hashmap.entrySet();
		//by using for each loop we can retrieve the element
		for(Entry<Integer,Double> en:ss) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
		sc.close();
		

	}

}

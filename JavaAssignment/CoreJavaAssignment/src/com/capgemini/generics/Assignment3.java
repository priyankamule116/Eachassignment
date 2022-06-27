package com.capgemini.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment3 {
    
	public static <T> void swap(T[] a,int i,int j)
	{
		//Swapping implementation is done here
		T t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static <T> void swap(List<T> l,int i,int j)
	{
		//InbUilt method which helps in swapping
		Collections.<T>swap(l,i,j);
	}
	public static void test()
	{
		String []a= {"1","2"};
		//Input
		List<String> l=new ArrayList<String>(Arrays.asList(a));
		swap(l,0,1);
		System.out.println("l :"+l);
	}
	public static void main(String[] args) {
		//Calling the methods 
		test();
	}

}




package com.capgemini.exception;

public class Demo {
    
	double x, y, z;
	public void add(int a, int b)
	{
		x=a; y=b;
		z=a+b;
		System.out.println("Addition is: "+z);
	}
	public void add(int a, double b)
	{
		x=a; y=b;
		z=a+b;
		System.out.println("Addition is: "+z);
	}
	
	public static void main(String[] args) 
	{
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj1.add(10,20);
		obj2.add(10, 15.5);
	}
}

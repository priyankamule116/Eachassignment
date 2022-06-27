package com.capgemini.java11;

interface Simpleinterest{
	int solve(int p,int r,int t);
}
public class Assignment1 {
public static void main(String args[])
{
	
	
	Simpleinterest a=(p,r,t)->p*r*t;
	System.out.println("The multiplication of three numbers is: "+a.solve(2,3,4));
}
}
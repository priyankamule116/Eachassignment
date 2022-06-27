package com.capgemini.exception;

public class ExceptionHandlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("E H");
		}
		System.out.println("hi");
		
		int a=10;
		int b=0;
		int[] arr= {1,2,3,4};
		String str=null;
		try {
			System.out.println(str.length());
			arr[6]=10;
			System.out.println(arr[6]);
			System.out.println(a/b);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmatic Exception is handled");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("A H");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception is handled");
		}
		

	}

}

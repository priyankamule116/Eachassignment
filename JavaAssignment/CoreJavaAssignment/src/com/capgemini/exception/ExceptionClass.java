package com.capgemini.exception;

public class ExceptionClass {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception is handled");
		}
		
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		
		int[] arr= {1,2,3};
		String str=null;
		try {
//			arr[6]=19;
			str.length();
			System.out.println("successfully added");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("e h");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null pointer exception is handled");
		}

	}

}

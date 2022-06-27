package com.capgemini.lambdaexpression;

@FunctionalInterface
interface ArithOperation{
	public abstract void operation(int a,int b);
}
public class ArithmaticOperationMain {

	public static void main(String[] args) {
		
		ArithOperation sum=(int a,int b)->{
			
			System.out.println("Sum of two numbers is: "+(a+b));
		};
		sum.operation(10, 20);
		
		ArithOperation sub=(int a,int b)->{
			System.out.println("Substraction of two number is: "+(a-b));
			
		};
		sub.operation(50, 25);
		
		ArithOperation multiply=(int a,int b)->{
			System.out.println("Multiplication of two numbers is: "+a*b);
		};
		multiply.operation(10, 5);
		
		ArithOperation divide=(int a,int b)->{
			System.out.println("Divide of two number is: "+a/b);
		};
		divide.operation(100, 20);
        
	}

}

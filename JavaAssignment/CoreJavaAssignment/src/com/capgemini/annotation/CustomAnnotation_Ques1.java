package com.capgemini.annotation;

@interface Test{
	int test_case();
}

public class CustomAnnotation_Ques1 {
    
	@Test(test_case=1)
	public static void method1() {
		System.out.println("Method 1 is executed...");
	}

	@Test(test_case=2)
	public static void method2() {
		System.out.println("Method 2 is executed...");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method1();
        method2();
	}

}

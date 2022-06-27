package com.capgemini.exception;

class FinalDemo {
	final int a = 10;
	int b = 15;

	// a=a+b;
	public final void show() {
		System.out.println("Hello World!");
	}
}

public class TestFinalDemo extends FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinalDemo demo = new TestFinalDemo();
		demo.show();
	}

}

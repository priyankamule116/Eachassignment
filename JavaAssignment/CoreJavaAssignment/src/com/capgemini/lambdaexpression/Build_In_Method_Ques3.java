package com.capgemini.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Build_In_Method_Ques3 {

	public static void main(String[] args) {

		Supplier<Double> randomValue = () -> Math.random();
		Predicate<Integer> greaterThan = i -> (i > 50);
		Consumer<Integer> display = (i) -> System.out.println(i);
		Function<Integer, Double> half = (a) -> a / 2.0;

		
		System.out.println("Using Supplier Functional Interface");
		System.out.println(randomValue.get());
		
		System.out.println(" ");
		
		System.out.println("Using Predicate Functional Interface");
		System.out.println(greaterThan.test(90));
		
		System.out.println(" ");
		
		System.out.println("Using Consumer Functional Interface");
		display.accept(100);
		
		System.out.println(" ");
		
		System.out.println("Using Function Functional Interface");
		System.out.println(half.apply(250));
		System.out.println("-------------------------------------");
	}
}
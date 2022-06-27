package com.capgemini.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Calories {

	public static void main(String[] args) {

		List<Fruit> fruitslist = Arrays.asList(
				new Fruit("Mango", 95, 90, "Yellow"), 
				new Fruit("Apple", 95, 30, "Red"),
				new Fruit("Strawberry", 25, 10, "Red"), new Fruit("Cherry", 10, 10, "Red"),
				new Fruit("Grapes", 15, 20, "Green")
				);

		// fruits.forEach(System.out::println);

		List<Fruit> sortedList = fruitslist.stream().sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println("Fruits with calories<100 are:");
		sortedList.forEach(System.out::println);

	}
}

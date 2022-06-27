package com.capgemini.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Color {

	public static void main(String[] args) {

		List<Fruit> fruitslist = Arrays.asList(new Fruit("Mango", 99, 90, "Yellow"), new Fruit("Apple", 95, 30, "Red"),
				new Fruit("Strawberry", 25, 10, "Red"), new Fruit("Cherry", 10, 10, "Red"),
				new Fruit("Grapes", 15, 20, "Green"));

		// fruits.forEach(System.out::println);
		List<Fruit> colorList = fruitslist.stream().sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		System.out.println("Colorwise sorting of fruits is:");
		colorList.forEach(System.out::println);
	}

}

package com.capgemini.lambdaexpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Thread_Ques8 {

	public static void main(String[] args) {
		Consumer<Integer> display = (i) -> System.out.println(i);
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);

		for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			display.accept(integer);
		}
		Thread lambdaThread = new Thread();
		lambdaThread.run();
	}
}

package com.capgemini.stream;

import java.util.List;

public class Fruit{
	
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruit(String name,Integer calories,Integer price,String color) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
    public String toString() {
    	return this.name+ " " + this.calories+ " " + this.price+" " +  this.color + " ";
    	

    }
	
	

}

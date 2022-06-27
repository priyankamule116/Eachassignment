package com.capgemini.assignment2;

//Abstract class
abstract class Shape {
	//Abstract method
	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line Shape");
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangles Shape");

	}

}

class Cubes extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Cube shape");
	}

}

public class DrawAllShapes5_Ques5 {
    
	//main method
	//Execution is always start from main method
	public static void main(String[] args) {
		//Creation of object of Shape class
		Shape shapeline = new Line();
		//Calling the method
		shapeline.draw();

		Shape shapeRect = new Rectangle();
		shapeRect.draw();

		Shape shapeCube = new Cubes();
		shapeCube.draw();

	}

}

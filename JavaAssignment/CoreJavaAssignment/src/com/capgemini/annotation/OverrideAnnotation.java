package com.capgemini.annotation;

//@override means the subclass override the parent class method is called @override annotation.
class Animal{
	void eatSomething() {
		System.out.println("The Animal is should be  Eating soomething");
		
	}
}
class Dog extends Animal{
	@Override
	void eatSomething() {
		System.out.println("The dog is should be  Eating soomething");
		
	}
}
public class OverrideAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a=new Dog();
       a.eatSomething();
	}

}

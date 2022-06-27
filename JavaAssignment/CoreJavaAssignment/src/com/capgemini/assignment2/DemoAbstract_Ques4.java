package com.capgemini.assignment2;

//4)We can not declare abstract class is private class
//then we declare then we got CTE
//private class abstract Demo{
//	
//}

//5)we can not declare abstract class is final
//then we declare we got CTE
//final abstract class Demo{
//	
//}

//6)you can declare a class abstract without having any abstract method
abstract class DemoClass{
	public void displayDemo() {
		System.out.println("This is concrete method");
	}
}
abstract class Demo{
	//1)If any class has any of it's method abstract
	//then you must declare entire class abstract
	public abstract void display();
	
	//2)Abstract class can not be instantiated
	//An abstract class cannot be instantiated directly i.e object of such class
	//can not be created directly using new keyword then we created we got a error CTE
	//An abstract class it is can be instantiated either by a concrete subclass or by defining 
	//all the abstract method along with new statement.
	//A concrete class can be instantiated directly using new keyword.
	
	//3)when we extend an abstract class,we must either override all the abstract method in subclass
	  //or declare subclass as abstract
	
	//4)Abstract class cannot be private
}
class ConcreteClass extends Demo {
	
    @Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
}
public class DemoAbstract_Ques4 {

	public static void main(String[] args) {
		//CTE ->We can not instantiated abstract class
		//Demo demo=new Demo();
		
		Demo demo=new Demo() {
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("This is display method");
			}
		};
		
		//In Concrete class we can create object directly using new keyword
		ConcreteClass c=new ConcreteClass();
		c.display();
	}

}

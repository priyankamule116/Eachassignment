package com.capgemini.assignment2;


class Employee{
	String name;
	double salary;
	
	//No Argument Constructor->Address the class
	public Employee() {
		name=null;
		salary=0.0;
	}
	
	//Parameterized Constructor->To get and set the data
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	//Method Overriding
	double getSalary() {
		return salary;
	}
}
class Manager extends Employee{
	int pf,tx;
	
	//No Argument Constructor->Address the class
	public Manager() {
		super();
		pf=tx=0;
	
	}
	
	//Parameterized Constructor->To get and set the data
	Manager(String name,double salary,int p,int tax){
		super(name,salary);
		pf=p;
		tx=tax;
	}
	
	//Method Overriding
	double getSalary() {
		return (super.getSalary()+pf+tx);
	}
}
class Labour extends Employee{
	int pf,tx;
	
	//No Argument Constructor->Address the class
	 public Labour() {
		super();
		pf=tx=0;
	}
	 
	 //Parameterized Constructor->To get and set the data
	 Labour(String name,double salary,int pff,int tax){
		 super(name,salary);
		 pf=pff;
		 tx=tax;
	 }
	 
	 //Method Overriding
	 double getSalary() {
		 return (super.getSalary()+pf+tx);
	 }
}
public class EmployeeMain_Ques2 {

	public static void main(String[] args) {
		
		//Creation of object of manager
		Manager m1=new Manager("Ganesh", 45327.87, 5000, 2000);
		System.out.println("Manager is Incentive");
		System.out.println("Total Salary of Manager is: "+m1.getSalary());
		
		//Creation of object of Labour
		Labour L1=new Labour("Saurabh", 42231.2, 3000, 2000);
		System.out.println("Labour is Over Time");
		System.out.println("Total Salary of Labour is: "+L1.getSalary());
	}

}

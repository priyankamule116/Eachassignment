package com.capgemini.assignment1;


//Find out all the Armstrong number falling in the range 100-999
public class ArmstrongNumber100to999 {
    
	
	//Static method
	public static void printArmstrong(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			int num=i;
			int r, sum=0;
			
			//loop
			while(num>0) {
				r=num%10;
				sum=sum+r*r*r;
				num=num/10;
			}
			//condition
			if(sum==i) {
				System.out.println(sum);
			}	
		}
	}
	//Main method
	//Execution is always start from main method
	public static void main(String[] args) {
		
		//Initialize the values in the variables
	    int n1=100;
	    int n2=999;
	    //calling method - Static method we can call directly
	    printArmstrong(n1, n2);
			
	

	}

}

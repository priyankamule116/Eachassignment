
//153=1^3+5^3+3^3=153 ->It is called Armstrong number
//Wright a program to find given number is Armstrong number or not

public class ArmstrongNumber {
   
	public static void main(String[] args) {
        int n=153;
        int temp=n;
        int r, sum=0;
        
        while(n>0) {
        	r=n%10;
        	n=n/10;
        	sum=sum+r*r*r;
        }
        if(temp==sum) {
        	System.out.println(sum+" It is an Armstrong Number");
        }
        else {
        	System.out.println(sum+" It is not Armstrong Number");
        }
        
        	}

}
package com.capgemini.assignment1;

import java.util.Scanner;

public class TotalScoreAndAverage9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2,s3;
		int s1java=78;
		int s2java=70;
		int s3java=90;
		
		int s1SQL=76;
		int s2SQL=90;
		int s3SQL=60;
		
		int s1Python=67;
		int s2Python=90;
		int s3Python=75;
		
		s1=s1java+s1Python+s1SQL;
		s2=s2java+s2Python+s2SQL;
		s3=s3java+s3Python+s3SQL;
		
		System.out.println("Total Score of student1 is: "+s1);
		System.out.println("Total Score of student2 is: "+s2);
		System.out.println("Total Score of student3 is: "+s3);
		
		System.out.println("Average of subjects: ");
		System.out.println("Average of all subject is: "+(s1+s2+s3)/3);
	
		System.out.println("Total Student all marks is: "+(s1+s2+s3));
		System.out.println("Average of Student is: "+(s1+s2+s3)/3);
		System.out.println("Java: "+((s1java+s2java+s3java)/3));
		System.out.println("Python: "+(s1Python+s2Python+s3SQL)/3);
		System.out.println("SQL: "+(s1SQL+s2SQL+s3SQL)/3);
		
		
		

	}

}

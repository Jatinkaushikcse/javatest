package com.jatin;

import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		
		
		System.out.println("Enter Number of Students you want to enter");
		  Scanner s1 = new Scanner(System.in);
			int num = s1.nextInt();
			System.out.println("======================================");
			for( int i =1 ; i<=num; i++) {
				System.out.println( " Enter the Roll Number: ");
				
				int roll = s1.nextInt();
				
				System.out.println("Enter the Name :");
			    
				String name = s1.next();
				
				System.out.println("Enter the marks");
				
				int marks = s1.nextInt();
				
				
				Student obji = new Student(roll,name,marks);
				
				System.out.println("Student Detail 0"+i);
				System.out.println( "Student Roll Number: " + obji.getrollNumber());
				System.out.println( "Student name: " + obji.getstudentName());
				System.out.println( "Student marks: " + obji.getmarks());				
				System.out.println("======================================");
			}
	}
}

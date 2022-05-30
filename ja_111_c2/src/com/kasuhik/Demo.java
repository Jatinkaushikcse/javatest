package com.kasuhik;

import java.util.Scanner;

public class Demo {
   
	
	 public static void main(String[] args) {
		 int total = 0 ;
		 System.out.println("Enter the num of students");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		 createing the array of student   ;
		
		Student student[] = new Student[num];
		
		for( int i=0; i<student.length; i++) {
			System.out.println("enter Details of student " +i+1);
			
			System.out.println("Enter roll");
			int roll  = sc.nextInt();
			System.out.println("Enter Marks");
			int marks = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter address");
			String address = sc.next();
			
			student[i] =  new Student(roll, marks, name, address);
			

		}
		for( int i=0; i<student.length; i++) {
			
			System.out.println("============================================");
			System.out.println("roll" + student[i].getroll());
			System.out.println("roll" + student[i].getname());
			System.out.println("roll" + student[i].getaddress());
			System.out.println("roll" + student[i].getmarks());
			
			
			total  = total + student[i].getmarks();
			
		}
		
		System.out.println(" the Avrage is " + total/student.length);
	
	}
}

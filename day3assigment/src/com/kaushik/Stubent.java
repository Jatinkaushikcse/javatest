package com.kaushik;

public class Stubent {
   int roll;
   int marks;
   String name;
	public static void main(String[] args) {
		Stubent obj1 = new Stubent();
		obj1.roll = 24;
		obj1.name = "jatin";
		obj1.marks = 80;
		obj1.displayStudentDetails(obj1.roll, obj1.marks, obj1.name);
		
		
		Stubent obj2 = new Stubent();
		obj2.roll = 23;
		obj2.name = "jatin kaushik";
		obj2.marks = 100;
		obj2.displayStudentDetails(obj2.roll, obj2.marks, obj2.name);
		
//		 now for garbage collection 
		obj1 = obj2;
		System.out.println(obj1);
		obj2 = null;
		System.out.println(obj1);
		obj1 = null;
		System.out.println(obj1);
		
	}
	public void displayStudentDetails(int roll, int marks, String name ) {
		System.out.println("roll is:" + roll);
		System.out.println("name is" + name);
		System.out.println("marks is:" + marks);
	}
}

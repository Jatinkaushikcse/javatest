package com.jatin;

public class Javabeans {

	 public static void main(String[] args) {
		 
		Demobean  obj = new Demobean();
		
		 obj.setroll(23);
		System.out.println(obj.getroll());
		
		Demobean  obj1 = new Demobean(24);
		System.out.println(obj1.getroll());
		
		 
	}
}




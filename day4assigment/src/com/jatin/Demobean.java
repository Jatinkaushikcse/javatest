package com.jatin;

public class Demobean {
  
//	roll: Integer
//	name: String
//	age: Integer
//	marks: Integer
	 private int roll ;
	 private String name;
	 private int age;
	 private int mareks;
	 
	 Demobean(){
		 
	 }
	 
	 Demobean(int roll){
		setroll(roll) ;
	 }
	 
	 
	 public void setroll( int roll) {
		 this.roll = roll ;	
	 }
	 
	 public int getroll() {
		 
		 return roll;
	 }
}

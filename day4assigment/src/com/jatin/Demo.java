package com.jatin;

public class Demo {
      
Demo(){
	    this("jatin");
		System.out.println("we are in first demo class");
		
	}
	
Demo( String S){
	this(10);
	System.out.println("we are in second demo class");
	}

Demo( int i){
	this(10.0f);
	System.out.println("we are in third demo class");
	
}
Demo(float f){
	
	System.out.println("we are in forth demo class");
}
	
	
	
	 public static void main(String[] args) {
		
		 
		  new Demo();
		 
	}
}

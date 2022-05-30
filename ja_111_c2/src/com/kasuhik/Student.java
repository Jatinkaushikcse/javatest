package com.kasuhik;

public class Student {
    
//	roll: Integer
//	name: String
//	address: String
//	marks: Integer
	 
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public Student() {
		
	}
	
	public Student( int roll, int marks, String name, String address) {
		this.roll  = roll;
		this.marks  = marks;
		this.name = name;
		this.address = address;
		
	}
	
	
	public int  getroll() {
		return this.roll;	
	}
	
	public  String  getname() {
		return this.name;	
	}
	
	public String  getaddress() {
		return this.address;	
	}
	
	public int  getmarks() {
		return this.marks;	
	}
}

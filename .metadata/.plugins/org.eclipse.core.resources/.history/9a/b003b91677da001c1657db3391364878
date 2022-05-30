package com.jatin;

import java.util.Scanner;

public class Course {
      
	int courseId;
	String courseName;
	 int courseFee;
	 
	 
	 public void displayCourseDetails(){
		 System.out.println(courseId);
		 System.out.println(courseFee);
		 System.out.println(courseName);
	 }
	 
	 public static void authenticate(String username, String password) {
		 if( username.equals("Admin") && password.equals("1234")) {
			 Scanner s1 = new Scanner(System.in);
			 Course obj1 = new Course();
			 System.out.println("Enter course id");
			 
			 System.out.println("Enter course fee");
			
			 System.out.println("Enter course name");
			 
			 obj1.courseId = s1.nextInt();
			 obj1.courseFee = s1.nextInt();
			 obj1.courseName = s1.next();
			
			 
			 obj1.displayCourseDetails();
			 
		 }else {
			 System.out.println("Invalid Username or password");
		 }
	 }
	 public static void main(String[] args) {
		authenticate("Admin", "1234");
		authenticate("Admin", "123");
	}
}

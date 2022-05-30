package com.jatin;
//    string is immutable because 

//  string are immutable in java  but the strings made from string buffer are mutable
//  length charAt indexOf lastIndexOf toUpperCase;
public class Difffstandstb {
	
 static String s1 = "hjatin";
   
    public static void main(String[] args) {
		
    	
    	System.out.println(s1.length());
    	System.out.println(s1.charAt(0));
         System.out.println(s1.indexOf('h'));
         
        System.out.println(s1.lastIndexOf('n'));
        System.out.println(s1.toUpperCase());
	}
 
 
}

package com.kaushik;

public class VolandConsonent {
    
	public static void main(String[] args){
		
//		char a = 65;
//		System.out.println(a);
		VolandConsonent obj = new VolandConsonent();
		obj.check('@');
		obj.check('s');
		obj.check('A');
		
	}
	  void check(char ch) {
		 byte b = (byte)ch;
		 
		 if((b <= 122  && b >=97) || ( b<=90  && b>=65)) {
		
		switch(ch) {
		case  'a': 
		case 'e' : 
		case  'i': 
		case  'o':
		case  'u': 
		case 'A':
		case 'E' : 
		case  'I': 
		case  'O':
		case  'U':	System.out.println("vowel");
		break;
		default : System.out.println("consonent");
			
		}
         }
		 else {
			 System.out.println("invalid character");
		 }
	}
}

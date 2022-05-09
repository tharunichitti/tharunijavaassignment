package javaAssignment;

import java.util.Scanner;

public class PalindromeString {
	
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any String ");
	String str= sc.next();

	String reverse="";
	//System.out.println(" original String:  "+str.toLowerCase());
	for(int i=0;i<str.length();i++) {
		reverse=str.charAt(i) + reverse;
		
	}
	//System.out.println(" Reverse of String:  "+reverse.toLowerCase());

if(str.equalsIgnoreCase(reverse)) {
System.out.println("Entered string is palindrome String");	
}
else {
	System.out.println("Entered string is not palindrome String");		
}
}
}

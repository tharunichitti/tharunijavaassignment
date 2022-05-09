package javaAssignment;
//Java Program to Check Whether a Character is Alphabet or Not

import java.util.Scanner;

public class CheckForAlphabet {
	public static void main(String[] args) {
		
		char a='c';
		if((a>='a' && a<='z') || (a>='A'&& a<='Z')) {
			System.out.println(a+" is an alphabet");
		}
		else {
			System.out.println(a+" is not an alphabet");
		}

	}
	
}

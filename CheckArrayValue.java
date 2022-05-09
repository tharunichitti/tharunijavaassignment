package javaAssignment;
//Java Program to Check if An Array Contains a Given Value

import java.security.DomainCombiner;

public  class CheckArrayValue {
	static char [] array= {'a','e','i','o','u'};

	public static void check(char ch) {
		int i=0;

		if(array[i]==ch) {
			System.out.println("Array contains entered value");
		}else {
			System.out.println("Array does not contains entered value");
		}
		i++;
	}
	public static void main(String[] args) {

		check('o');
	}
}

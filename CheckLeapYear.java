package javaAssignment;

import java.util.Scanner;

// Java Program to Check Leap Year

public class CheckLeapYear {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year");
	int a = sc.nextInt();
	if(a%4==0) {
		System.out.println(a+" is leap year");
	}
	else {
		System.out.println(a+" is not a leap year");
	}
}
}

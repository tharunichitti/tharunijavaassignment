package javaAssignment;

import java.util.Scanner;

public class EvenOddNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value ");
	int num1= sc.nextInt();
	if(num1%2==0) {
		System.out.println("It is an even Number");
	}
	else
		System.out.println("It is an odd Number");
}
}

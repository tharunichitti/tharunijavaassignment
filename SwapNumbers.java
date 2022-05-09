package javaAssignment;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  Value");
		int num1= sc.nextInt();
		System.out.println("Enter Value2");
		int num2= sc.nextInt();
		System.out.println("Before swapping : num1= "+num1+" num2 = "+num2);
		int num3= num1+num2; 
		num1=num2;
		num2=num3-num1; 
		num1=num3-num2;
		System.out.println("After swapping : num1= "+num1+" num2 = "+num2);



	}
}

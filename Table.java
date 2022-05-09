package javaAssignment;
//Java Program to Generate Multiplication Table

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int multiple=1;
		for(int i=1;i<=10;i++) {
			multiple=a*i;
			System.out.println(a+ " * "+i+" = "+multiple);
		}
	}
}

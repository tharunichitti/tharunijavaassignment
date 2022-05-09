package javaAssignment;

public class FibonacciSeries {
//Display Fibonacci Series
	public static void main(String[] args) {
		int maxLimit=10;
		int sum=0;
		int a=0, b=1;
		System.out.println("fibonacci series: ");
		 System.out.print(a+" "+b);//printing 0 and 1 
		for(int i=0; i<=maxLimit; i++) {
			sum= a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}

	}

}

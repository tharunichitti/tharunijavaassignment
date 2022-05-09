package javaAssignment;

public class PrimeNumber {
	
	public static void isPrime(int num) {
	int n=num;
	boolean check=false;
	for(int i=2;i<=num/2;++i) {
		System.out.println(i);
		if(num%i==0) {
			check= true;
			break;
		}
	}
	if(!check) {
		System.out.println(num +" is Prime number ");
	}
	else {
		System.out.println(num+" is not Prime number");
	}

	}
public static void main(String[] args) {
	isPrime(3);
	
}
}

package javaAssignment;

public class CalculateAverageUsingArray {

	public static void main(String[] args) {
		int array[]= {15,7,0,77,17,3,48,36};
	    double average;
	    int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];	
		}
		average=sum/array.length;
		System.out.println(" Average of all elements in array is: "+average);
	}

}
